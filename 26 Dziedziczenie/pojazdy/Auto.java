package pojazdy;

public class Auto extends PojazdKolowy {
    public int liczbaDrzwi;

    public Auto(Silnik silnik, int iloscKol, int liczbaDrzwi) {
        super(silnik, iloscKol);
        this.liczbaDrzwi = liczbaDrzwi;
    }

    @Override
    public void dzwiek(){
        System.out.println("brum brum");
    }

    public void wyswietlInformacje(){
        System.out.println("Samochod: pojazdy.Silnik: moc: " + silnik.getMoc() + " ilosc paliwa: " + silnik.getIloscPaliwa()
        + "\nIlosc kol: "+ iloscKol + " liczba drzwi: " + liczbaDrzwi);
    }
}
