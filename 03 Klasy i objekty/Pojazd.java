public class Pojazd {
    String model;
    String kolor;
    int przejechane_km;

    //konstruktory - przeciazenie konstruktorów = kilka w jednej klasie
    Pojazd(){

    }
    Pojazd(String m, String k, int km){
        //do wywoływanie konstruktora w tej samej klasie
        this(m,k);
        przejechane_km = km;
    }

    Pojazd(String model, String k){
        this.model = model; // this => odwołanie do składowej klasy = dodatkowa referencja która wskazuje na obiekt
        kolor = k;
        przejechane_km = 0;
    }


    //    metoda
    void dodajPrzejechaneKm(int km) {
        przejechane_km += km;
    }
    //mozna tez przeciazac metody ofc
}
