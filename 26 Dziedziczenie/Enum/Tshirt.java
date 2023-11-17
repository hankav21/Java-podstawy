package Enum;

public class Tshirt {
    //stałe
//    public static final int SMALL = 1;
//    public static final int MEDIUM = 2;
//    public static final int LARGE = 3;

    private Size size;

    public Size getSize() {
        return size;
    }

//    public void setSize(int size) {
//        if (size >= SMALL && size <= LARGE)
//            this.size = size;
//    }

//    enum
    public void setSize(Size size) {
        this.size = size;
    }
}

class exe {
    public static void main(String[] args) {
        Tshirt tshirt = new Tshirt();
//        tshirt.setSize( Tshirt.SMALL);
        System.out.println(Size.SMALL.getDescription() + "  " + Size.SMALL.name() + " " + Size.SMALL.ordinal());
        System.out.println(Size.SMALL.toString());
        tshirt.setSize(Size.SMALL);
        System.out.println(Size.SMALL);
        System.out.println(Size.SMALL.getDescription());

        ///gdy tworzymy enum ze stringa to musi miec wartosc identyczna jak stala w nim
        String size = "SMALL";
        Size shirtSize = Size.valueOf(size);

        Size.valueOf(size);
        Tshirt tshirt1 = new Tshirt();
        tshirt1.setSize(shirtSize);

        System.out.println("Dosepne rozmiary:");
        Size[] values = Size.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i].toString());

        }
    }
}
