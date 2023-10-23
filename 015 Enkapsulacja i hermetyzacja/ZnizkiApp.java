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
//        System.out.println(klienci[0]); = null
        for (int i = 0; i < klienci.length; i++) {

            String nazwisko;
            //alt + enter - dodaje do klasy wsystkie brakujace importy
            System.out.println("Podaje imie klienta premium: ");
            String imie = input.nextLine();
            System.out.println("Podaje nazwisko klienta premium: ");
            nazwisko = input.nextLine();

            klienci[i] = new Klient(imie, nazwisko, true);
        }

        input.close();
        //zamykamy skaner. Jesli mamy kilka ktore korzystaja ze strumienai system.in,
        // to robiac close zamykamy sobie mozliwość odczytu z konsoli => wtedy przy zamknieciu aki to robic
        System.out.println(klienci[0].getImie());


    }
}
