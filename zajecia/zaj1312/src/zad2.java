import java.util.*;

enum F{
    A,B
}

class P{
    int x,y;

    public P(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        P p = (P) o;
        return x == p.x && y == p.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "P{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class M{
    HashMap<P,F> map;
    P max_pkt = new P(6,6);
    M(){
        map = new HashMap<>();
    }

}

interface Ii{
    boolean validate(M m, P pOld, P pNew);
}


public class zad2 {
    public static void move(M m, P pOld, P pNew){
//        F wartosc = m.map.get(pOld);
//        m.map.remove(pOld);
//        m.map.put(pNew,wartosc);

        Optional<F> o = Optional.ofNullable(m.map.get(pOld));
        o.ifPresent(s -> {F wartosc = m.map.get(pOld);
                           m.map.remove(pOld);
                           m.map.put(pNew,wartosc);});
    }

    static boolean check_czy_wolne(M m, P pOld, P pNew){
        Optional<F> o= Optional.ofNullable(m.map.get(pNew));
        return o.isEmpty();
    }
    static boolean czy_ruch_w_linii(M m, P pOld, P pNew){
        return (pOld.x == pNew.x || pOld.y == pNew.y);
    }

    static boolean czy_ruch_zmiesci_sie_w_planszy(M m, P pOld, P pNew){
        return (m.max_pkt.x >= pNew.x && m.max_pkt.y >= pNew.y);
    }




    public static void main(String[] args) {
        M m = new M();
        m.map.put(new P(1,1), F.A);
        System.out.println(m.map);
        move(m, new P(1,1), new P(5,5));
        System.out.println(m.map);
        move(m, new P(2,1), new P(5,5));
        System.out.println(m.map);

        //sprawdzanie warunkow
        List<Ii> lista_sprawdzen = new ArrayList<>();
        lista_sprawdzen.add(zad2::check_czy_wolne);
        lista_sprawdzen.add(zad2::czy_ruch_w_linii);
        lista_sprawdzen.add(zad2::czy_ruch_zmiesci_sie_w_planszy);
        boolean v = true;
        for(Ii x: lista_sprawdzen) v &= x.validate(m, new P(1,1), new P(1,5));
        System.out.println(v);

        System.out.println(czy_ruch_zmiesci_sie_w_planszy(m, new P(1,1), new P(1,2)));
    }
}
