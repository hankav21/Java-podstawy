package skladoweStatyczne;

public class Kalkulator {

    //final wiec nie mozna zmienic wartosci
    static final double PI = 3.14;

    //dzieki static mozemy odwolywac sie bez twozrenai obiektu
    static double poleKola(double r){
        return PI * r * r;
    }

    static double obwodKola(double r){
        return 2 * PI * r;
    }
}
