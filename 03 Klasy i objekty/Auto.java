public class Auto {
//    po zdefiniowniu klasy staje sie ona nowym typem danych
    //szablon
    Pojazd pojazd; //agregacja = obiekt składa sie z innych objektów
    int liczbaDrzwi;

    Auto(){
        pojazd = new Pojazd();
    }

    //kompozycja = istnienie obiektu bez swojego rodzica nie ma sensu np. smierc osoby = zniszczenie obiektu mózgu

//    metody
//    typ_zwracany nazwaMetody(opcjonalne_parametry)

    void wyswietl_informacje() {
        System.out.println("Model: " + pojazd.model + " Kolor: " + pojazd.kolor +
                " Przejechane km: " + pojazd.przejechane_km + " Liczba drzwi: " + liczbaDrzwi);
    }


}
