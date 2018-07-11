package pl.javastart;


import java.util.Random;


public class SmartHome {

    InfoProvider stacjaPogodowa = new StacjaPogodowa(new Random());
    public Sterownik sterownikGlosnika = new SterownikGlosnika();
    public Sterownik sterownikPieca = new SterownikPieca();
    public Sterownik sterownikRolet = new SterownikRolet();

    public void uruchomSterowniki(){
        DanePogodowe danePogodowe = stacjaPogodowa.pobierzDane();
        sterownikGlosnika.action(danePogodowe);
        sterownikPieca.action(danePogodowe);
        sterownikRolet.action(danePogodowe);
    }


}
