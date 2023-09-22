import java.awt.*;

public class Konwersje {
    public static void main(String[] args) {
        int x = 10;
        int y = 4;
        double z = 4;
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y); //2
        System.out.println(x / z); //2.5
        System.out.println(x % y);  //reszta z dzielenia/modulo

        //ctrl + / => //

        x = x + 5;
        x += 5;

        x =+ 5; //przypisanie +5
        System.out.println(x);
        x =- 5; //przypisanie -5
        System.out.println(x);

        System.out.println("czy x jest wiekszy niz y: " + (x > y));

        boolean xEqualsY = x == y;
        System.out.print("czy x jest rowny y: " + xEqualsY);

        xEqualsY = x != y;
        System.out.println("czy x jest rozne od y: " + xEqualsY);

        boolean negacja = !xEqualsY;

        System.out.println("czy x LUB y jest mniejsze od 0 : " + (x < 0 || y < 0));
        System.out.println("czy x I y jest mniejsze od 0 : " + (x < 0 && y < 0));

        //inkrementacja i dekrementacja
        x++; //przyrostkowa
        ++x; //przedrostkowa

        //konkatenacja
        String n1 = "n1";
        String n2 = "n2";
        System.out.println(n1 + n2);
        //kolejnosc ma znaczenie
        System.out.println(5 + 5 + " ABC"); //wynik "10 ABC"
        System.out.println("ABC " + 5 + 5); //wynik "ABC 55"

        //konwersje typow
        double number1 = 10.987;
        int number2 = 5;
        // konwersja zawężająca (eng. narrowing)
        int narrowing = (int) number1;
        // konwersja rozszerzająca (eng. widening)
        double widening = (double) number2; //jest mniejszy do wiekszego wiec nie trzeba podawac
        System.out.println("Narrowing: " + narrowing);
        System.out.println("Widening: " + widening);

        //uwaga przy wysweitlaniu char
        char letter1 = 'k';
        char letter2 = 'o';
        char letter3 = 't';
        System.out.println("Błędne \"sumowanie\" znaków");
        System.out.println(letter1 + letter2 + letter3);
        System.out.println("Tekst jawny");
        System.out.println("" + letter1 + letter2 + letter3);
        //inkrementacja char => przesówani e znaków

    }
}