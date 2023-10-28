package pojazdy;

import pojazdy.Pojazd;

public class PojazdKolowy extends Pojazd {
    public int iloscKol;

    public PojazdKolowy(Silnik silnik, int iloscKol) {
        super(silnik);
        this.iloscKol = iloscKol;
    }
}
