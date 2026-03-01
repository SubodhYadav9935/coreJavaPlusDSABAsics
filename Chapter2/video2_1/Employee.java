package Chapter2.video2_1;

public class Employee {
    private int salary = 5000;
    private String address = "London";
    private static String department = "IT";

    public int getSalary() {
        getDepartment();
        return salary;
    }
    public String getDepartment(){
        System.out.println("I could not start chapter one because did not learn chapter one");
        return department;
    }
    public String getAddress(){
        System.out.println(this );
        return address;
    }
    public static String getDepartment2(){

        new Employee().getSalary();

        return "I am lazy";
    }

    public static void main(String...x) {

        //getAddress();
        Employee.getDepartment2();
    }


}
