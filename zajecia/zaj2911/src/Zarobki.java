import java.util.ArrayList;
import java.util.List;

public class Zarobki {
    public static void main(String[] args) {
        Staff staff = new Staff();
        staff.addEmploye(new Employe(1,30.0));
        staff.addEmploye(new Employe(1,40.0));
        staff.addEmploye(new Employe(1,50.0));
        staff.addEmploye(new Employe(2,130.0));
        staff.addEmploye(new Employe(3,10.0));
        staff.addEmploye(new Employe(2,130.0));

        System.out.println(staff.srednieZarobki(1));
        System.out.println(staff.srednieZarobki(2));
        System.out.println(staff.srednieZarobki(3));
    }
}

class Employe{
    int nmDzialu;
    double salary;

    public Employe(int nmDzialu, double salary) {
        this.nmDzialu = nmDzialu;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public int getNmDzialu() {
        return nmDzialu;
    }
}

class Staff{
    List<Employe> employes =  new ArrayList<>();



    void addEmploye(Employe emp){
        this.employes.add(emp);
    }

    double srednieZarobki(int nmDzialu){
        this.employes.ge
        double sum = this.employes.stream().filter(n -> n.nmDzialu == nmDzialu).mapToDouble(Double::doubleValue).sum();
        return  1.0;
    }

}
