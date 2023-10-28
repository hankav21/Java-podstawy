package pojazdy;

public class Silnik {
    private int moc;
    private double iloscPaliwa;

    public int getMoc() {
        return moc;
    }

    public void setMoc(int moc) {
        this.moc = moc;
    }

    public double getIloscPaliwa() {
        return iloscPaliwa;
    }

    public void setIloscPaliwa(double iloscPaliwa) {
        this.iloscPaliwa = iloscPaliwa;
    }

    public Silnik(int moc, double iloscPaliwa) {
        this.moc = moc;
        this.iloscPaliwa = iloscPaliwa;
    }



}
