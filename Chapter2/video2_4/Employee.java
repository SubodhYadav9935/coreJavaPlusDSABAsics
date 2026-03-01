package Chapter2.video2_4;

public class Employee {
    private String name;
    private static String department;

    public static void main(String[] args) {
        Employee e = new Employee();
        e.name="Aman";
        department="IT";
        System.out.println(e.name);
        Employee e1 = new Employee();
        e1.name="Subodh";
        department="IT";
        System.out.println(e1.name);
    }
}
