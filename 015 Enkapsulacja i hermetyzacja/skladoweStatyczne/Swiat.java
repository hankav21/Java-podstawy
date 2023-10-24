package skladoweStatyczne;

public class Swiat {
    private static final int JABLKO = 666;
    //dzieki stalej nie ma kkoniecznosci twozrenai obeiektu
    
    public static void main(String[] args) {
        Czlowiek adam = new Czlowiek("Adam", 199);
        Czlowiek ewa = new Czlowiek("Ewa", 166);

        Czlowiek.sredni_wzrost = (adam.getWzrost() + ewa.getWzrost())/2;

        System.out.println("sredni wzrost: " + Czlowiek.sredni_wzrost);
        System.out.println("sredni wzrost: " + adam.sredni_wzrost);
        System.out.println("sredni wzrost: " + ewa.sredni_wzrost);
        //2 ost to zla praktyka
        //wypiszSredniWzrost(); (obecnie:  private void wypiszSredniWzrost(){)
        //metoda main jest metoda statyczna = nie jest powiazana z zadna instancja
        //= moznemy sie w niej odnosic tylko do innych metod tatycznych w ramach tej klasy
        // ==> wiec teoretycznie trzeba zrobic:
        /*
            wypiszSredniWzrost wsw = new wypiszSredniWzrost();
            wsw.wypiszSredniWzrost();
         */
        //zeby odwolac sie pezez sama nazwe to musi byc to metoda statyczna
        wypiszSredniWzrost();
    }

    private static void wypiszSredniWzrost(){
        System.out.println("sredni wzrost: " + Czlowiek.sredni_wzrost);
    }
}
