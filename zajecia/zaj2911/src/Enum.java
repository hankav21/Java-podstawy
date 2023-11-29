public class Enum {
    public static void main(String[] args) {

    }
}

enum ChargeLvl {
    FULL(1, "x"),
    HIGH(2, "y"),
    MEDIUM(3, "z"),
    LOW(4, "w");

    private int lvl; private String color;

    ChargeLvl(int lvl, String color) {
        this.lvl = lvl;
        this.color = color;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public String getColor() {
        return color;
    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
}

class Battery {
    int id;
    ChargeLvl chlvl;

    public Battery(int id, ChargeLvl chlvl) {
        this.id = id;
        this.chlvl = chlvl;
    }
}

class e2{
    public static void main(String[] args) {
        Battery battery = new Battery(21, ChargeLvl.LOW);
        System.out.println(battery.chlvl.getLvl());
        System.out.println(battery.chlvl.getColor());
    }
}

enum E {
    A,B,C,D;
}

class M{
    public static void main(String[] args) {
        E e = E.D;
        int a = switch (e){
            case A:
                System.out.println("A");
                yield 1;
            case B:
                System.out.println("B");
                yield 2;
            default:
                System.out.println(3);
                yield 3;
        };
        System.out.println(a);
    }
}

