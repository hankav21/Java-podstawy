package polimorfizm;

public class KlasaObjects {
    public static void main(String[] args) {
        Kot k1 = new Kot("Mre",1);
        Kot k2 = new Kot("Mre",1);
        Kot k3 = k1;
        Kot k4 = new Kot("Ryszard");

        System.out.println("k1 == k2: " + (k1 == k2));
        System.out.println("k1 == k3: " + (k1 == k3));
        System.out.println("^ == przy klasach określa czy zmienne wskazuja na to soamo miejsce w pamieci\n");

        System.out.println("k1 equals k2: " + (k1.equals(k2)));
        System.out.println("k1 equals k3: " + (k1.equals(k3)));
        System.out.println("k1 equals k4: " + (k1.equals(k4)));
        System.out.println("^ Domyślnie equals = == wiec  tzreba dopisac jak ma porownywac\n");

        System.out.println("k1.hashCode: " + (k1.hashCode()));
        System.out.println("k2.hashCode: " + (k2.hashCode()));
        System.out.println("k3.hashCode: " + (k3.hashCode()));
        System.out.println("k4.hashCode: " + (k4.hashCode()));

        System.out.println(k1.toString());

    }
}
