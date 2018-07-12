package pl.javastart;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class StacjaPogodowa implements InfoProvider {

    private Random random;

    public StacjaPogodowa(Random random) {
        this.random = random;
        System.out.println("Stacja pogodowa pobiera informacje o temperaturze");
    }

    public DanePogodowe pobierzDane() {
        DanePogodowe danePogodowe = new DanePogodowe(getTemperature(), getSunnyInfo());
        return danePogodowe;
    }

    private int getTemperature() {
        return random(-25, 35);
    }

    private boolean getSunnyInfo() {
        return random.nextBoolean();
    }

    private int random(int from, int to) {
        int a = Math.abs(from);
        return random.nextInt(a + to + 1) - to;
    }
}