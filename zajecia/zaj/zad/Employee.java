package zad;

public class Employee {
    private String name, gender;
    private short salary;

    public Employee(String name, String gender, short salary) {
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public short getSalary() {
        return salary;
    }
}
