package Chapter3.video3_5;

public class Test2 {
    public static void main(String[] args) {
        int val = 10;
        Employee e = new Employee("Anjana", 2);
        m1(e);
        System.out.println(e.getId());
    }
    public static void m1(Employee e){
        e.setId(5);
        e=new Employee("padama",7);
        e.setId(9);
    }
}
class Employee{
    int id;
    String name;
    Employee(String name,int id){
        this.name= name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
