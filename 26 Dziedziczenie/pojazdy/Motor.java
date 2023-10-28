package pojazdy;

public class Motor extends PojazdKolowy {
    public String x;

    public Motor(Silnik silnik, int iloscKol, String x) {
        super(silnik, iloscKol);
        this.x = x;
    }
}
