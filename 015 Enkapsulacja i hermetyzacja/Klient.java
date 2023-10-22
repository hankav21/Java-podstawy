public class Klient {
    String imie, nazwisko;
    boolean klientPremium;


    //konstruktory
    public Klient(String imie, String nazwisko, boolean klientPremium) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.klientPremium = klientPremium;
    }




    //getery i setery:
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public boolean isKlientPremium() {
        return klientPremium;
    }

    public void setKlientPremium(boolean klientPremium) {
        this.klientPremium = klientPremium;
    }
}
