package pl.javastart;

public class DanePogodowe {
    private int temperatura;
    private boolean isSunny;

    public DanePogodowe(int temperatura, boolean isSunny) {
        this.temperatura = temperatura;
        this.isSunny = isSunny;
        }

    public int getTemperatura() {
        return temperatura;
    }

    public boolean isSunny() {
        return isSunny;
    }
}
