package String;

import java.util.Arrays;
import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        //poniewaz obiektów string tworzymy duzo jest optymalizacja ze
        // 2 identyczne nei sa tworzone oddzielnie tylko wskazuja na to samo
        //znajduja sie na stercie w String Constant Pool
        String s1 = "A";
        String s2 = "A";
        System.out.println(s1 + s2);

        //możemy je tez tworzyc przy uzyciu konstruktora
        //w tym wypadku na stercie bd 2 obiekty z 2 referencjami
        String ks1 = new String("A");
        String ks2 = new String("A");

        System.out.println("S1 a S2: " + s1.equals(s2) + ", przy == :" + (s1 == s2));
        System.out.println("S1 a sk1: " + s1.equals(ks1)+ ", przy == :" + (s1 == ks1));
        System.out.println("Sk1 a Sk2: " + ks1.equals(ks2)+ ", przy == :" + (ks1 == ks2));
        System.out.println("Wnioski: przy towrzeniu tak, że sa w String Constant Pool wskazuja na ten sam obiekt." +
                "\nGdy używamy konstruktora sa 2 roznymi obiektami" +
                "\nEquals porownuje nam wartosci wiec wszedzie true");

        Scanner sc = new Scanner(System.in);
        System.out.println("podaj 1 napis: ");
        String str1 = sc.nextLine();
        System.out.println("podaj 2 napis: ");
        String str2 = sc.nextLine();
        System.out.println("Porownanei pobranych stringow: " + str1.equals(str2) + ", przy == :" + (str1 == str2));
        System.out.println("Wnioski: gdy pobieramy za pomocą skanera wywolywany jest konstruktor " +
                "\ni nie mozna ich porownywac przez == (przy uzyciu referencji)");


        //...2....................
        //obiekty typu String sa niemodyfikowalne
        String hello = "hello";
        hello += "world";
        System.out.println(hello);
        /*
        Choć mże sie wydawać, że mamy tam 1 obiekt to w rzeczywistości tworzone sa 3:
        hhello
        word
        hello + world

        Zamiast modyfikacji podczas konkatenacji tworzymy nowy obiekt i wpisujemy go na miejsce starego

        Pod spodem java uzywa StringBuildera (do tworzenia dluzszych napisów)
            dzieki tej klasie mozemy faktycznie łaczyc kilka napisów zamiast tworzyc je za kazdym razem
         */
        String zbudowanyStr = new StringBuilder("Hello").append("World").toString();
        //tak to wyglada

        /*
        konsekwencje:
            za każdym razem jak dodajemy sobie cos do sringa wywolywany jes konstruktor StringBuilder
            = gdy jestesmy w petli to za kazdym razem jest towrzony nowy taki obiekt
            (co w javie jest bd kosztowne)
        * */
        long start = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            builder.append(i);
        }
        String stringKoncowy = builder.toString();
        long stop = System.currentTimeMillis(); //mozna system.nanoTime
        System.out.println("czas wykonania przy uzyciu buildera: " + (stop-start));

        start = System.currentTimeMillis();
        String napis = "";
        for (int i = 0; i < 10000; i++) {
            napis += i;
        }
        stop = System.currentTimeMillis();
        System.out.println("czas wykonania dla konkatenacji stringa: " + (stop-start));

        System.out.println("Wnioski: czas dla buildera jest powaznie mniejszy");

        //3...................
        //najbardziej uzytecznie meody na string
        String words = " jaenen jaj nenen jajaj    ";
        String sub = words.substring(2,7); // od ktroego indeksu, do ktorego +1
        String replace = words.replaceAll(" ", "_");
        String trim = words.trim();
        char c = words.charAt(2);
        String upper = words.toUpperCase();
        int dl = words.length();
        String[] split = words.split("a");

        System.out.println(words);
        System.out.println(sub);
        System.out.println(replace);
        System.out.println(trim);
        System.out.println(c);
        System.out.println(upper);
        System.out.println(dl);
        System.out.println(split);
        System.out.println(Arrays.toString(split));
        System.out.println(Arrays.toString(words.trim().split("a")));


    }
}
