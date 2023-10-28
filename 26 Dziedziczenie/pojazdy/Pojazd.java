package pojazdy;

public class Pojazd {
    Silnik silnik;

    public Pojazd(Silnik silnik) {
        this.silnik = silnik;
    }

    public void dzwiek() {
        System.out.println("brrrrr");
    }
}
