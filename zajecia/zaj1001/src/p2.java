//dostep do tego samego zasobu przez kilka watkow

class Counter{
    int value = 0;
     void pp(){ //v2 => synchronized void pp()
        synchronized (this) {
            int a = value;
            a++;
            int j = 0;
            for (int i = 0; i < 1000; i++) {
                j += i;
            }
            value = a;
        }
    }
}
public class p2 {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        //definiujemy watki
        Thread th1 = new Thread(() -> {for(int i = 0; i<1000; i++) c.pp(); });
        Thread th2 = new Thread(() -> {for(int i = 0; i<1000; i++) c.pp(); });
        Thread th3 = new Thread(() -> {for(int i = 0; i<1000; i++) c.pp(); });
        //w lambdzie jest to samo co w p1 robilismy

        th1.start();
        th2.start();
        th3.start();

        //zebysmy mieli pewnosc ze wszytskie 3 watki si ezakonczyly
        th1.join(); //do maina poczlo throws
        th2.join();
        th3.join();

        System.out.println(c.value);
        //wynik jest rozny bo w czasie pomiedzy pobraniem i zapisaem value na roznych watach ij atroche czsu

        //synchronized void pp() sprawia ze tylko 1 watek ma dostep do metody i wynik jest 3000 (watke zostaje odblokowany gdy ten co go uzywal go zwolnil)
        //ale jak tak zrobimy wszytskie metody wielowatkowe to przestaje miec to sens
        //slatego lepiej zrobic to tylko na kawalku spornego kodu:
        /*synchronized (this) {
            int a = value;
            a++;
            int j = 0;
            for (int i = 0; i < 1000; i++) {
                j += i;
            }
            value = a;
        }*/
    }

}
