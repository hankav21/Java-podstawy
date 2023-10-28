package polimorfizm;

public class Zoo {
    public static void main(String[] args) {
        Zwierze z = new Zwierze("Surykatka");
        Zwierze p = new Pies("Fafel");
        Zwierze k = new Kot("Puszek");

        z.dajGlos();
        p.dajGlos();
        k.dajGlos();

        //polimorfizm - pozwala definiowac referencje ogolnego typu i przypisywac do nich bardziej szczegolowe
        //== zwierze moze byc stworzone jako Kot (usi byc relacja dziedziczenia)
        //ale wtedy nie mozna korzystac z tego co jest bardziej szczegolowe
        //== nie moge uzyc w k zamrucz = bo metoda zawsze wywolywana jest na typie obiektu
        //a obiekt jest zawsze tego typu jaki konstruktor wywołalismy do jego utowrzenia (to po prawej sie liczy)
        //ale zwby wywolac musi byc to istniec w typie referencji = dateego nie ma miauczenia

        //dzieki polimorfizmowi mozemy przechowywac na tablicy rozne zwierzeta
        Zwierze[] zwierzeta = new Zwierze[3];
        zwierzeta[0] = new Zwierze("Wunsz");
        zwierzeta[1] = new Pies("Ciepek");
        zwierzeta[2] = new Kot("Zbigniew");

        for (Zwierze zwierze: zwierzeta) {
            zwierze.dajGlos();
        }

        zmienImie(zwierzeta[0], "piesel");

        Pies konkretnyPies = (Pies) p;
        konkretnyPies.szczekaj(); //dzieki zrzutowanej referencji mozna szczekac na zwierzeciu p

        ((Kot)k).zamrucz(); //2 sposob rzutowania referencji

        //rzutowanie moze byc niebezpieczne bo deklarujemy ze jestesmy pewni ze
        // ta referencja jest w typie w ktorym mozna to wywolac i komp nam wierzy a to moze byc blad
//        Pies blad = (Pies) k;
//        blad.szczekaj();
        if (k instanceof  Pies) {
            Pies blad = (Pies) k;
            blad.szczekaj();
        } //zabezpieczenie przed zlym rzutowaniem


    }

    //dzieki polimorfizmowi jest jedna dla wszystkich
    private static void zmienImie(Zwierze zwierze, String imie){
        zwierze.setNazwa(imie);
    }
}
