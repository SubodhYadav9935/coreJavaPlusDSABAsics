package Chapter2.video2_4;

public class Employee1 {
    private String name= "Aman";
    private static String department= "IT";

    public static void main(String[] args) {
        Employee1 e = new Employee1();
        System.out.println(e.name);
        System.out.println(e.department);
        Employee1 e1 = new Employee1();
        System.out.println(e1.name);
        System.out.println(e1.department);

    }
}
