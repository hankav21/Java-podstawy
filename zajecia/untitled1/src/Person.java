import java.time.*;

public class Person  {
    //imie, rok ur , wzrost, plec
    String name, sex;
    int born_year; //
    double height;

    public Person(String name, String sex, int born_year, double height) {
        this.name = name;
        this.sex = sex;
        this.born_year = born_year;
        this.height = height;
    }

    public int getAge(){
        int i = Year.now().getValue() - born_year;
        return i;
    }

    public String getName() {
        return name;
    }

    public boolean isFemale(){
        if (name.equals("Female") || name.equals("female") || name.equals("F") || name.equals("f")) return true;
        return false;
    }

    //    konstruktor
//
//    get age - pobiera biezacy rok  i zwrava wiek
//            get name
//                    is female
}
