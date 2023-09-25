public class Sklep {
    public static void main(String[] args) {

        String model = "Audi";
        String kolor = "czarny";
        int liczbaDrzwi = 5;

        Auto auto1 = new Auto(); //obiekt = new Auto() = tworzy sie nowy ek=gzemplarz w pamieci
        //auto1 = referencja
        Auto auto2 = auto1; //referencja na ten sam oboekt = zmiany w auto2 dzialaja w auto1 = wskazuja to samo miejsce w pamieci
        auto1.pojazd.model = model;
        auto2.pojazd.kolor = kolor;
        auto1.liczbaDrzwi = liczbaDrzwi;
        auto1.pojazd.przejechane_km = 0;
        auto1.pojazd.dodajPrzejechaneKm(10);

        System.out.println(auto1.pojazd.przejechane_km);

        System.out.println(auto1.pojazd.kolor);
        System.out.println(auto1); //java nie wie w jakim formacie chcemy to wyswietlic
//        System.out.println(model + " kolor: " + kolor + " liczba drzwi: " + liczbaDrzwi);

        auto2 = null;

//        System.out.println(auto1.pojazd.kolor);
//        System.out.println(auto2.pojazd.kolor); //NullPointerException

        auto1.wyswietl_informacje();
//        auto2.wyswietl_informacje();

        Fabryka_samochodow fabryka = new Fabryka_samochodow();
        Auto auto3 = fabryka.wyprodukuj("Mustang", "czerwony", 3 );
        auto3.wyswietl_informacje();

    }
}
