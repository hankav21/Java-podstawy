import java.util.Locale;
import java.util.Scanner;

public class ZnizkiApp {
    public static void main(String[] args) {


        Klient klient1 = new Klient("Wilchelma", "Zawiecha", true);
        double cena = 1100;
        double cenaObnizona;
        ZnizkiService serwisZnizkowy = new ZnizkiService();
        cenaObnizona = serwisZnizkowy.obliczCenePoObnizce(klient1,cena);

        System.out.println("dzieki rabatowi zaoszczedzone zostalo: " + (cena - cenaObnizona) +  " zł");

        Klient klienci[] = new Klient[3];
        Scanner input = new Scanner(System.in);
        //wprowadzamy lokalizacje zeby wyłapywało przecinki nie były kropkowe
        input.useLocale(Locale.ITALY);
//        System.out.println(klienci[0]); = null
        for (int i = 0; i < klienci.length; i++) {

            String nazwisko;
            //alt + enter - dodaje do klasy wsystkie brakujace importy
            System.out.println("Podaje imie klienta premium: ");
            String imie = input.nextLine();
            System.out.println("Podaje nazwisko klienta premium: ");
            nazwisko = input.nextLine();

            klienci[i] = new Klient(imie, nazwisko, true);

            System.out.println("wprowadz kwote i sprawdz ile zaplaci ten klient: ");
            Double kwota = input.nextDouble();
            input.nextLine(); //tu pożeram znak nowej lini który nie jest wczytywany gdy wywołyje sie  nexLiczbowe
            System.out.println("Do zapłaty: " + serwisZnizkowy.obliczCenePoObnizce(klienci[i], kwota));
        }


        //foricz = dla kazdego elementu tablicy wykonaj polecenia w ciele ppetli
        for(Klient kl: klienci){
            System.out.println(kl);
            //! kl nie jest odwolaniem sie do elementu tablicy.
            // Jest to zmienna z kopia watrosci org tab.
            //=> uzywac raczej jedynie do odczytu
        }
        //break = przerwanie iteracji i wyjscie z petli
        //continue = przerwanie akt iteraci i przejscie do nast

        input.close();
        //zamykamy skaner. Jesli mamy kilka ktore korzystaja ze strumienai system.in,
        // to robiac close zamykamy sobie mozliwość odczytu z konsoli => wtedy przy zamknieciu aki to robic
        System.out.println(klienci[0].getImie());


    }
}
