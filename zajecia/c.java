class Box{
//    własciwosci klasy - dostaja wartości domyslne (jak tablice) przy tworzeniu obiektu
    double w, h, d = 2; //to co w konstruktorze jest warxzniejsze od przypisania tutaj

    //metody klasy - maja dostep do obeiktow dla ktorych bd wywolywana (tutaj wlasciwości)
    double volume(){
        return (w*h*d);
    }

    void setDim(double w, double h,  double nd){
        this.w = w;
        this.h = h;
        d = nd;
    }

    //konstruktory -> nie deklarujemy typu zwracanego
    Box() {
        w = 1;
        d = 1;
        h = 1;
    }

    Box(int a){
        w = a;
        d = a;
        h = a;
    }

    Box(int w, int d, int h){
        this.w = w;
        this.d = d;
        this.h = h;
    }

    Box(Box copy){
        w = copy.w;
        d = copy.d;
        h = copy.h;
    }

}


public class c {
    public static void main(String[] args) {
////        zmienna referencyjna
//        Box box;
//        box = new Box();
//        box.w = 9;
//        System.out.println(box.w);
//        System.out.println(box.h);
//        Box box2 = new Box();
//        System.out.println(box);  //Box@5f184fc6 jaka klasa i unikalny w 16 bitach numer obiektu
//        System.out.println(box.hashCode());
//        System.out.println(box2);
//
//        box2 = box; //w rozne wskazania na ten sam obiekt
//        System.out.println(box);  //Box@5f184fc6 jaka klasa i unikalny w 16 bitach numer obiektu
//        System.out.println(box2);

        Box box = new Box();
        box.w = 1;
        box.d = 2;
        box.h = 3;
        box.setDim(4,5,6);
        System.out.println(box.volume());
        Box box2 = new Box(box);
        box.setDim(1,2,3);
        System.out.println(box2.volume());

    }
}
