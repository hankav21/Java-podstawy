package zaj1701;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

class Rynek extends Thread{
    static ArrayList<String> lista_transakcji;
    static int ilosc_na_rynku;

    Rynek(){
        lista_transakcji = new ArrayList<>();
        ilosc_na_rynku = 0;
    }

    public static void zabierz_z_rynku(String kto, int nm){
        ilosc_na_rynku--;
        Rynek.lista_transakcji.add(LocalDateTime.now() + ": " + kto + " zamowienie nm: " + nm + ". Stan rynku: " + Rynek.ilosc_na_rynku);
    }

    public static void dodaj_na_rynek(String kto, int nm, int ile){
        ilosc_na_rynku += ile;
        Rynek.lista_transakcji.add(LocalDateTime.now() + ": " + kto + " dostawa nm: " + nm + ". Stan rynku: " + Rynek.ilosc_na_rynku);
    }


    @Override
    public void run() {
        super.run();
    }
}

class Klient extends Thread{

    String nazwa;


    @Override
    public void run() {
        super.run();
    }
}

class Kupiec extends Klient{

    int ilosc_kupionych;
    Kupiec(String nazwa){
        super.nazwa = nazwa;
        ilosc_kupionych = 0;
    }

    @Override
    public void run() {
        double lambda = 100;
        for (int i = 0; i < 10; i++) {

            double rand = ThreadLocalRandom.current().nextDouble();

            long now = System.currentTimeMillis();
            double czas_do_nast = ostZaj.getExp(rand,lambda);
            while (System.currentTimeMillis() < czas_do_nast + now){}

            synchronized (this) {
                if (Rynek.ilosc_na_rynku > 0) {
                    Rynek.zabierz_z_rynku(super.nazwa, i);
                    System.out.println(super.nazwa + " zamowienie nm: " + i + ". Stan rynku: " + Rynek.ilosc_na_rynku);
                }
            }

        }
        //System.out.println("    klient " + nazwa  + "wiecej nei kupi");
    }
}

class Sprzedawca extends Klient{
    int liczba_produktow;
    Sprzedawca(String nazwa){
        super.nazwa = nazwa;
        liczba_produktow = 10;
    }

    @Override
    public void run() {
        System.out.println("    zaczynam");
        synchronized (this) {
            Rynek.dodaj_na_rynek(super.nazwa, 0, liczba_produktow);
            System.out.println(super.nazwa + " wszedł na rynek. Stan rynku: " + Rynek.ilosc_na_rynku);
        }
        for (int j = 0; j < 5; j++) {
            long now = System.currentTimeMillis();
            while (System.currentTimeMillis() < now +200){}

            synchronized (this) {
                Rynek.dodaj_na_rynek(super.nazwa, j + 1, liczba_produktow);
                System.out.println(super.nazwa + " ma "+ j +1 + " dostawe. Stan rynku: " + Rynek.ilosc_na_rynku);
            }

        }
        System.out.println("    end");

    }
}



public class ostZaj {
    //funkcja ktora pokazuje co jakis czas bd cos wylosowane?
    static double getExp(Double rand, double lambda){
        return  - lambda * Math.log(1 - rand);
    }

    public static void main(String[] args) throws InterruptedException {

        Rynek rynek1 = new Rynek();

        Kupiec kupiec1 = new Kupiec("Kupiec_1");
        Kupiec kupiec2 = new Kupiec("Kupiec_2");

        Sprzedawca sprz1 = new Sprzedawca("Sprzedawca_1");

        rynek1.start();
        sprz1.start();
        kupiec1.start();
        kupiec2.start();


        sprz1.join();
        kupiec1.join();
        kupiec2.join();
        rynek1.join();


        System.out.println("Raport: ");
        for(String x: Rynek.lista_transakcji) System.out.println(x);

    }

}


