import java.util.HashMap;

public class t2 {
    public static void main(String[] args) {
        HashMap<String,Integer> capital = new HashMap<>();
        capital.put("E",1);
        capital.put("G",2);
        capital.put("N",3);
        System.out.println(capital);

        System.out.println(capital.get("E"));
        capital.remove("E");
        System.out.println(capital.get("P"));

        for(Integer i: capital.values()){
            System.out.println(i);
        }

        for(String i : capital.keySet()){
            System.out.println("key: " + i + " value: " + capital.get(i));
        }

    }
}
