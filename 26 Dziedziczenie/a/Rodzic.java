package a;

public class Rodzic {
    protected int wiek; //mozna korzytsac w dziecku
    int wzrost; //klasa domysla = nie ma jej w dziecku

    //kazda klasa w Javie dziedziczy po klasie Object

    public Rodzic(int wiek, int wzrost) {
        this.wiek = wiek;
        this.wzrost = wzrost;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public int getWzrost() {
        return wzrost;
    }

    public void setWzrost(int wzrost) {
        this.wzrost = wzrost;
    }

    //metody sa dziedziczone
    public void info(){
        System.out.println("wiek: "+ wiek);
    }
}
