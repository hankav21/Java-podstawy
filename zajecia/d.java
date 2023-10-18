class a {
    int a =1, b = 2;
    void f(){ System.out.println("f z a");}

    a(int a) {this.a = a;} // przez to ze napisalismy jwoj konstr. to nie jest juz tworzony ten domyslny gdy nic nie tworzymy
}

//dziedziczenie (= rozszerza klase => ma dostep do wszytskiego z tamtej klasy i rozszerza o swoje
class b extends a{
    int c = 3;
    int a = 4; //przykrywa ta z klasy a (ale ta z kl a wciaz istnieje w niej i mzemy sie odwolac do niej przez 'super")
    void show(){
        System.out.println(a+ " "  + super.a);
    }

    void f() { System.out.println("f z b");}
    void fa() { super.f();}

    b(int a, int b) {
        //zawsze niejawnie jak nie ma innego to wywoluje bezparametrowy super()
        super(a); //musi byc 1 instrukcja
        this.b = b;

    }
}

public class d {
    public static void main(String[] args) {

        b b = new b();
        System.out.println(b.a);
        b.show();

        //reprezentowanie obiektu przez referencje do klasy bazowej
        a b2 = new b(); //mamy dostep tylko do zasobow odziedzczonych w b przez a

        b b3 = new b();
        a a3 = b3;
        System.out.println(b3.a + " " + a3.a);
        b3.f();
        a3.f();
        b3.fa();
        // = o tym z jakiej klasy zostaje ywywolywana metoda decyduje klasa obiektu

    }
}
