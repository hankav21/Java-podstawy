public class SklepSamochoodowy {
    public static void main(String[] args) {

        String model = "Audi";
        String kolor = "czarny";
        int liczbaDrzwi = 5;

        Auto auto1 = new Auto(); //obiekt = new Auto() = tworzy sie nowy ek=gzemplarz w pamieci
        //auto1 = referencja
        Auto auto2 = auto1; //referencja na ten sam oboekt = zmiany w auto2 dzialaja w auto1 = wskazuja to samo miejsce w pamieci
        auto1.model = model;
        auto2.kolor = kolor;
        auto1.liczbaDrzwi = liczbaDrzwi;

        System.out.println(auto1.kolor);
        System.out.println(auto1); //java nie wie w jakim formacie chcemy to wyswietlic
//        System.out.println(model + " kolor: " + kolor + " liczba drzwi: " + liczbaDrzwi);

        auto2 = null;

        System.out.println(auto1.kolor);
        System.out.println(auto2.kolor); //NullPointerException
    }
}
