package pl.javastart;

import org.springframework.stereotype.Component;

@Component
public class SterownikRolet implements Sterownik {

    public void action(DanePogodowe danePogodowe) {
        boolean isSunny = danePogodowe.isSunny();
        if (isSunny) {
            System.out.println("Jest słonecznie. Zasłaniam rolety.");
        } else {
            System.out.println("Jest pochmurno. Nie zasłaniam rolety.");
        }
    }
}
