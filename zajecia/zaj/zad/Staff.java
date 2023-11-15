package zad;

public class Staff {
    private Employee[] pracownicy = new Employee[10];

    void addEmpolyee(Employee e){

        for (int i = 0; i < pracownicy.length; i++) {

            if(pracownicy[i] == null) {
                pracownicy[i] = e;
                break;
            }
        }

    }

    Short avgSalary(){
        short sum = (short) 0.0;
        for (int i = 0; i < pracownicy.length; i++) {
            if(pracownicy[i] != null) {
                short sal = pracownicy[i].getSalary();
                    sum += sal;
                }else{
                sum /= i;
                break;}
            }
        return sum;
    }

    Short avgSalaryMale(){
        short sum = (short) 0.0;
        int meni = 0;
        for (int i = 0; i < pracownicy.length; i++) {
            if(pracownicy[i] != null && pracownicy[i].getGender() == "Male") {
                short sal = pracownicy[i].getSalary();
                sum += sal;
                meni++;
            }else{
                sum /= meni;
                break;}
        }
        return sum;
    }


}

class st{
    public static void main(String[] args) {
        Staff st = new Staff();
        Employee e1 = new Employee("Jacek", "Male", (short) 10);
        Employee e2 = new Employee("Gzregorz", "Male", (short) 20);
        Employee e3 = new Employee("Marta", "Female", (short) 30);
        st.addEmpolyee(e1);
        st.addEmpolyee(e2);
        st.addEmpolyee(e3);
        System.out.println(st.avgSalary());
        System.out.println(st.avgSalaryMale());

    }
}
