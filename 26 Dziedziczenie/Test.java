import b.Dziecko;
import pojazdy.Auto;
import pojazdy.Silnik;


public class Test {
    public static void main(String[] args) {

        Auto auto1 = new Auto(new Silnik(21, 33),
                4,
                3);
        auto1.wyswietlInformacje();
        auto1.dzwiek();

        auto1.hashCode(); //to dziedziczone z klasy object
        //problem diamentu = nie mozna dziedziczyc wielokrotnie

        Dziecko d = new Dziecko();
        

    }



}
