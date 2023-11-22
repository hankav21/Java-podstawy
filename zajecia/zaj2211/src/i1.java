public interface i1 {
    void f();
}

class E {
    //moz esie zdarzyc ze w klasie jest funkcja o takiej samej sygnaruzre co interefejs
    static  void h() {System.out.println("ok");}

}

class mm {

    static void g(i1 i ) { i.f();}

    public static void main(String[] args) {
        //podanie referencj do metody f, bo ma taka sama sygnature a parametrem jest i1
        g(E::h);


        //* moje pyt
        i1 i = E::h;
        g(i);

        i1 ii = () -> E.h();
        g(ii);
        ////////////.............

    }
}

//.....................................................................................



interface myFunc <T> {
    int f(T[] tarr, T t);
}

class mmm{
    static <T> int countMatching (T[] tab, T t){
        int count = 0;

        for (Object o: tab) {
            if(o.equals(t)) count++;
        }

        return count;
    }

    //ilosc wystapien t w tarr
    static <T> int myF(myFunc<T> f, T[] tarr, T t) {
        return f.f(tarr, t);
    }

    public static void main(String[] args) {

        Integer[] tabI = new Integer[4];
        tabI[0] = (Integer) 1;
        tabI[1] = (Integer) 1;
        tabI[2] = (Integer) 1;
        tabI[3] = (Integer) 2;

        System.out.println(mmm.<Integer>countMatching(tabI,tabI[0]));

        System.out.println(myF(mmm::countMatching, tabI, tabI[0]));

        String[] tabS = new String[3];
        tabS[0] = "Ala";
        tabS[1] = "Ala";
        tabS[2] = "Alan";

        System.out.println(myF(mmm::countMatching, tabS, tabS[0]));
    }
}
