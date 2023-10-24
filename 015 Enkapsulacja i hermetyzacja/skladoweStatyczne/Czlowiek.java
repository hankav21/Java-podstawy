package skladoweStatyczne;

public class Czlowiek {
    private String imie;
    private double wzrost;
    public static double sredni_wzrost;
    //poniewaz pole jest statyczneto nie jest w stercie bezposrednio tylko na stercie metaspace
    // i jest zawsze w 1 miejscy pamieci dla wszystkich obiektow

    public String getImie() {
        return imie;
    }

    public Czlowiek(String imie, double wzrost) {
        this.imie = imie;
        this.wzrost = wzrost;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public double getWzrost() {
        return wzrost;
    }

    public void setWzrost(double wzrost) {
        this.wzrost = wzrost;
    }

    public static double getSredni_wzrost() {
        return sredni_wzrost;
    }

    public static void setSredni_wzrost(double sredni_wzrost) {
        Czlowiek.sredni_wzrost = sredni_wzrost;
    }
}
