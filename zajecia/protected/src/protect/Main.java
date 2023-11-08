

package protect;

//import statyczny
import static java.lang.Math.*;

class X{
    int i = 1;
    static int j = 1;

    static void f(){
        j++;
    }
}

class Y <T> {
    //T = parametr typu
    T t;
    T[] array;
    Y (T t) {this.t = t;}
    T getT(){return t;}
}



// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Y <Integer> y1 = new Y<>(5);
        Integer i = y1.getT();

        Y <String> y2 = new Y<>("abc");
        String s = y2.getT();

        System.out.println(s + " " + i);

//            A a = new A();
//            a.a();
//            System.out.println(pow(2,1));
//
//            int i = 10, j = 10;
//            System.out.println(i == j);
//            int k = 1000000, l = 1000000;
//            System.out.println(k == l);
//
//            Integer ii=10, jj =10;
//            System.out.println(ii == jj);
//            Integer iii=1000000000, jjj =1000000000;
//            System.out.println(iii == jjj);



    }
    }
