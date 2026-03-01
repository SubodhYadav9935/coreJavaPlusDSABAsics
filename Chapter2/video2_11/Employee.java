package Chapter2.video2_11;
class Person {
    private int id;
    private String name;
    private String fathersName;
    Person(){

    }
    Person(int id,String name){
        this.id= id ;
        this.name=name;
    }
}
public class Employee extends Person{
    private int id ;
    private String name;
    private String address;
    private String spouseName;
    Employee(int id , String name){
        this.id=id ;
        this.name= name;

    }

    public static void main(String[] args) {
        Employee e = new Employee(12,"Pankaj");
        System.out.println(e.id);
        System.out.println(e.name);
        System.out.println(e.spouseName);
        System.out.println(e.address);
    }
}
