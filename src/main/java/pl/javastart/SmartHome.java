package pl.javastart;

import org.springframework.stereotype.Component;

@Component
public class SmartHome {

    private InfoProvider stacjaPogodowa;
    private Sterownik sterownikGlosnika;
    private Sterownik sterownikPieca;
    private Sterownik sterownikRolet;

    public SmartHome(InfoProvider stacjaPogodowa, Sterownik sterownikGlosnika, Sterownik sterownikPieca, Sterownik sterownikRolet) {
        this.stacjaPogodowa = stacjaPogodowa;
        this.sterownikGlosnika = sterownikGlosnika;
        this.sterownikPieca = sterownikPieca;
        this.sterownikRolet = sterownikRolet;
    }

    public void uruchomSterowniki(){
        DanePogodowe danePogodowe = stacjaPogodowa.pobierzDane();
        sterownikGlosnika.action(danePogodowe);
        sterownikPieca.action(danePogodowe);
        sterownikRolet.action(danePogodowe);
    }


}
