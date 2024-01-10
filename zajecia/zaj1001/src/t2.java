import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


class klient extends Thread{

    int nazwa;

    klient(int nazwa){
        this.nazwa = nazwa;

    }

    @Override
    public void run() {


        double lambda = 100 + nazwa * 10;
        for (int i = 0; i < 10; i++) {
            String s = "zamowil wlasnie klient: " + nazwa +  " zamowienie nm: " + i;

            double rand = ThreadLocalRandom.current().nextDouble();


            long now = System.currentTimeMillis();
            double czas_do_nast = t2.getExp(rand,lambda);
            while (System.currentTimeMillis() < czas_do_nast + now){}

            System.out.println(s + " " + czas_do_nast);
            zamowienie new_zam = new zamowienie(nazwa, i);
            zamowienia lista_zam = 


        }
        System.out.println("    klient " + nazwa  + "wiecej nei kupi");
    }


}
class zamowienie{
    int klient;
    int numer;

    public zamowienie(int klient, int numer) {
        this.klient = klient;
        this.numer = numer;
    }
}
class zamowienia{

    static ArrayList<zamowienie> lista_zam;


    zamowienia(){
        lista_zam = new ArrayList<>();
    }


    void dodaj(zamowienie zam){
        synchronized (this){
            lista_zam.add(zam);
        }
    }
}
class fabryka extends  Thread{


    @Override
    public void run() {
        System.out.println("    zaczynam");
        for (int j = 0; j < 10; j++) {
            long now = System.currentTimeMillis();
            while (System.currentTimeMillis() < now +200){}
            System.out.println("DUMP"  + j);

        }
        System.out.println("    end");
    }

    void wypisz_zamwoienia(){

    }
}


public class t2 {

    //funkcja ktora pokazuje co jakis czas bd cos wylosowane? (rozkladem punsona??)
    static double getExp(Double rand, double lambda){
        return  - lambda * Math.log(1 - rand);
    }

    public static void main(String[] args) throws InterruptedException {
        List<klient> lista_klientow = new ArrayList<>();
        lista_klientow.add(new klient(1));
        lista_klientow.add(new klient(2));
        lista_klientow.add(new klient(3));

        Thread fab = new Thread(new fabryka());

        fab.start();
        for(klient x: lista_klientow) x.start();



        //lambda[i -1] = i * 40.;
        //name[i - 1] = "klient" + i;
    }
}
