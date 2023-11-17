public class Trojkat {
    double a,b,c;


    public Trojkat(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    boolean isReactang(){
        //czy jest prostokatny
        //a^+b^ = c^
        if((((a * a) + (b * b)) == c * c) || (((a * a) + (c * c)) == b * b) || (((b * b) + (c * c)) == a * a))
            return true;
        return  false;
    }



    double getPerim(){
        //dlugosc obwodu
        return a + b + c;
    }
}

//3,4,5, =12

//3,3,3, = 9