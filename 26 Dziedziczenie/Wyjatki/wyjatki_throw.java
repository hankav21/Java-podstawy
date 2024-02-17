package Wyjatki;

public class wyjatki_throw {
    public static void main(String[] args) {

    }
}

class Car{
    private static final double ZUZYCIE_PALIWA = 8; //8l/100kl
    private static final double MAX_PALIWO = 50;
    private double paliwo;

    public void zatankuj(double dodatkowePaliwo){
        if(paliwo+dodatkowePaliwo > MAX_PALIWO)
            throw new IllegalArgumentException("nie mozna zatankowac. zmiesci sie jeszcze max: " + (MAX_PALIWO));
        else
            paliwo += dodatkowePaliwo;
    }

    public void jedz(){
        if(paliwo-ZUZYCIE_PALIWA < 0)
            throw new 
        else
            paliwo -= ZUZYCIE_PALIWA;

    }

    public String toString(){
        return "Stan paliwa: " + paliwo;
    }
}

class TestSamochodu{
    public static void main(String[] args) {
        Car car = new Car();
        car.zatankuj(10);
        System.out.println(car);
        car.jedz();
        System.out.println(car);
    }
}
