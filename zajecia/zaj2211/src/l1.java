import java.util.function.*;
//^na ogol maja tam postac sparametryzowana

public interface l1 {
    void f();
}

class l2 implements l1{
    public void f() {}
    void g(){}
}

interface l3 {
    boolean f(int i, int j);
}

interface l4a{
    int f(int i);
}

interface l4b{
    String f(String s);
}

interface l4 <T>{
    T f(T t);
}

class m{

    static int g(l4a l, int x) {return  l.f(x);}

    public static void main(String[] args) {
//        l1 l = new l2();
//        l.f();
//        //l.g(); - nie mozna bo mozna tylko z metod ktore sa zaczerpniete z interfejsu

        //instancja klasy anonimowej ktora implementuje interfejs
        l1 l = new l1() {
            public  void f(){

            }
        };
        //^intersejs funkyjny = tylko taki mozemy zast lambda (tylko z 1 metoda abstr.
        l.f();

        l3 ll = (x,y) -> {return x>y;};
        System.out.println(ll.f(5,2));

        //ma probrac i zwrocic Integer
        Function<Integer,Integer> lll = x -> 10;
        //przyjmuje 2 zmienne i zwraca 3
        BiFunction<Boolean,Boolean,String> lll2 = (a,b) -> {if (a.equals(b)) return "OK"; else return  "no";};

        System.out.println(lll.apply(0));
        System.out.println(lll2.apply(true , false));

        //zad: lambda czy 1 par dzieli sie przez 2
        l3 zad1 = (x,y) -> {if (x%y == 0) return true; else return false;};
        System.out.println(zad1.f(4,2));

        //zad2: interfejs sparametryzowany, ma metode przyjmujaca ref do obiektu i zwracajacy ten sam typ
        //implementujemy a) -> silnia (= typ integer, zwraca Integer)
        //b) string -> odwrocony
        l4a zad2a = x -> {
            int sil = 1;
            for (int i = 2; i <= x; i++) {
                sil *= i;
            }
            return sil;
        } ;
        System.out.println("zad2a = silnia = " + zad2a.f(1));
        System.out.println(zad2a.f(0));
        System.out.println(zad2a.f(2));
        System.out.println(zad2a.f(3));


        l4b zad2b = x -> {
            String s = "";
            for (int i = x.length()-1; i >= 0 ; i--) {
                s += x.charAt(i);
            }
            return s;
        };
        System.out.println(zad2b.f("abcd"));

        //z interfejsem sparametryzowanym
        l4<Integer> z2a = x -> {
            int sil = 1;
            for (int i = 2; i <= x; i++) {
                sil *= i;
            }
            return sil;
        } ;
        System.out.println("zad2a = silnia = " + zad2a.f(1));
        System.out.println(zad2a.f(0));
        System.out.println(zad2a.f(2));
        System.out.println(zad2a.f(3));



        l4<String> z2b = x -> {
            String s = "";
            for (int i = x.length()-1; i >= 0 ; i--) {
                s += x.charAt(i);
            }
            return s;
        };
        System.out.println(zad2b.f("abcd"));

        //uw 1: mozna korzystac ze zmiennych z otoczenei jesli sa lub zachowuja sie jak finalnie
        final int a = 10;
        l4a zm = x -> x -a;

        //uw 2  i 3
        l4a lambda = x -> x*x;
        System.out.println(g(lambda, 6));
        System.out.println(g(x -> x*x, 6));


    }
}
