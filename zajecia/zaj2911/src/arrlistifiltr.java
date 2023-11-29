import java.util.ArrayList;
import java.util.List;

public class arrlistifiltr {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");

        al.add(2,"H");

        System.out.println(al.size());

        System.out.println(al);

        al.remove("C");
        al.remove(1);

        System.out.println(al.size());
        System.out.println(al);

        System.out.println(al.indexOf("H"));

        System.out.println(al.contains("H"));
    }
}
