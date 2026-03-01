package Chapter2.video2_11;

public class Employee1 {
    private int salary;
    private String name;
    {
        System.out.println("I am an inside the instance block1");
    }
    {
        System.out.println("I am an inside the instance block2");
    }
    Employee1(int salary,String name){
        this.salary= salary ;
        this.name = name;
        System.out.println("constructor gets called");
    }
    static {
        System.out.println("I am an inside the static block1");
    }

    public static void main(String[] args) {
        Employee1 e1  = new Employee1(12,"Ajad");
        System.out.println(e1.name);
        System.out.println(e1.salary);
        Employee1 e2  = new Employee1(12,"Ajad");
    }
    static {
        System.out.println("I am an inside the static block2");
    }
}
