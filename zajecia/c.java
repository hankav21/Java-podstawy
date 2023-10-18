class Box{
//    własciwosci klasy - dostaja wartości domyslne (jak tablice) przy tworzeniu obiektu
    double w, h, d;

}


public class c {
    public static void main(String[] args) {
//        zmienna referencyjna
        Box box;
        box = new Box();
        box.w = 9;
        System.out.println(box.w);
        System.out.println(box.h);
        Box box2 = new Box();
        System.out.println(box);  //Box@5f184fc6 jaka klasa i unikalny w 16 bitach numer obiektu
        System.out.println(box.hashCode());
        System.out.println(box2);

        box2 = box; //w rozne wskazania na ten sam obiekt
        System.out.println(box);  //Box@5f184fc6 jaka klasa i unikalny w 16 bitach numer obiektu
        System.out.println(box2);

    }
}
