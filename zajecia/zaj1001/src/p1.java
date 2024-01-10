class tr2 implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 100; i++){
            System.out.println("tr2 " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

//wilowatkpwpsc mozna tak jak tr1  lub tr2
class tr1 extends Thread {
    //Thread juz implementuje Runnable
    //ale jest trywialna
    //zeby tak nie bylo to nadpisujemy run
    @Override
    public void run() {
        for(int i = 0; i < 100; i++){
            System.out.println("tr1 " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class p1 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new tr1());
        Thread thread2 = new Thread(new tr2());

        //jesli chcemy nowe watki to nie wywolujemy bezposrednio run (zeby byly wykonywane rownolegle)
        //robimy start
        thread1.start();
        thread2.start();

        tr1 t = new tr1();
        t.start();
        tr2 t2 = new tr2();
        //t2.start(); ni e jest dostepna bo robilismy przez extend i to ze zdefiniowalismy run nie znaczy ze jest start


    }
}
