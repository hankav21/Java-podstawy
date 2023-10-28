package b;

import a.Rodzic;

//final = po tej klasie nikt nie moze dziedziczyc
final public class Dziecko extends Rodzic {
    public Dziecko(){
        super(2,21);
        //konstruktory w javie nie sa dziedziczone
        //wykorzystujac metode super mozemy wywołac konstruktor klasy nadrzednej
        //super musi byc 1 w konstruktorze
        //nawet jak tego nie wpiszemy to i tak sie wywoluje najpier w konstruktor z klasy nadzrednej

        wiek = 1;
//        wzrost = 21; //wzrost jest w rodzicu klasa domyslna i dlatefo nie ma jej w dziecku

    }

    public void info(){
        super.info(); // bez super bysmy zapetliki
        System.out.println("latka: "+ wiek);
    }

}
