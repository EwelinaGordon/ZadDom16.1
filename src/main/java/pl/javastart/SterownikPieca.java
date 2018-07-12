package pl.javastart;


import org.springframework.stereotype.Component;

@Component
public class SterownikPieca implements Sterownik {

    public void action(DanePogodowe danePogodowe) {

        int temperatura = danePogodowe.getTemperatura();
        if (temperatura > 15) {
            System.out.println("Jest ciepło. Nie uruchamiam pieca.");
        } else {
            System.out.println("Jest zimno. Uruchamiam piec.");
        }
    }
}