package pl.javastart;

import org.springframework.stereotype.Component;

@Component
public class SterownikGlosnika implements Sterownik {

    public void action(DanePogodowe danePogodowe) {
        int temperatura = danePogodowe.getTemperatura();
        boolean isSunny = danePogodowe.isSunny();

        String text = "";

        if (isSunny) {
            text = "jest";
        } else {
            text = "nie jest";
        }
        System.out.println("Dzień dobry. Dzisiejsza temperatura " + temperatura + "*C i " + text + " słonecznie. " +
                "To będzie dobry dzień!");
    }

}