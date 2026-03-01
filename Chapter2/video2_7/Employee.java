package Chapter2.video2_7;

public class Employee {
    public int salary = 5000;
    private String name = "Mohan";

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Colleage{
    public static void main(String[] args) {
        Employee e = new Employee();
        e.salary=-3009;
        System.out.println(e.salary);
    }
}
class Manager{
    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println(e.salary);
        System.out.println(e.getSalary());
    }
}
