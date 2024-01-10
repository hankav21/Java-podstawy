import java.util.concurrent.ThreadLocalRandom;

public class t1 {
    public static void main(String[] args) {
        double lambda = 100;
        for (int i = 0; i < 10; i++) {
            String s = "abc" + i;
            double rand = ThreadLocalRandom.current().nextDouble();
            System.out.println(s + " " + getExp(rand,lambda));


        }
    }


    //funkcja ktora pokazuje co jakis czas bd cos wylosowane?
    static double getExp(Double rand, double lambda){
        return  - lambda * Math.log(1 - rand);
    }
}

