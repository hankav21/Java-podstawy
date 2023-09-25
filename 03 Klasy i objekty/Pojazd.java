public class Pojazd {
    String model;
    String kolor;
    int przejechane_km;

    //konstruktory
    Pojazd(){

    }
    Pojazd(String m, String k, int km){
        model = m;
        kolor = k;
        przejechane_km = km;
    }

//    metoda
    void dodajPrzejechaneKm(int km) {
        przejechane_km += km;
    }
}
