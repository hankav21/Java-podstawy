
class Y {
    //T = parametr typu
    Object t = new Object();
    Object[] array = new Object[10];
    Y (Object t) {this.t = t;}
    Object getT(){return t;}
}
public class o {
    public static void main(String[] args) {
        Y y1 = new Y(5);
        Integer i = (Integer) y1.getT();
        Y y2 = new Y("abc");
        String s = (String) y2.getT();
        System.out.println(s + " " + i);

    }
}
