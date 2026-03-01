package Chapter2.video2_4;

public class Employee3 {
    static int count= 0;
    {
        System.out.println("instance block 1");
    }
    static {
        count ++;
        System.out.println(count);
    }
    {
        System.out.println("instance block 2");
    }
    Employee3(){
        System.out.println("constructor");
    }
    public static void main(String[] args) {
        System.out.println("hello");
        Employee3 e = new Employee3();


    }
}
