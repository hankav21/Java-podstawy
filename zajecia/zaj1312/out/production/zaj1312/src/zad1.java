import java.util.ArrayList;
import java.util.List;

interface I{
    boolean validate(O o);
}
class O{
    int o1 = 1;
    int o2 = 2;
}


public class zad1 {

    static boolean check01(O o) {return o.o1 == 1;}
    static boolean check02(O o) {return o.o2 == 2;}

    public static void main(String[] args) {
        List<I> l = new ArrayList<>();
        O o = new O();
        l.add(zad1::check01);
        l.add(zad1::check02);
        boolean v = true;
        for (I x: l) v &= x.validate(o);
        System.out.println(v);
    }
}
