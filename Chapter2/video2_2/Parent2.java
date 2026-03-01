package Chapter2.video2_2;

import Chapter2.video2_1.Employee;

public class Parent2 {
    public Object m1(){
        System.out.println("Parent");
        return null;
    }
}
class Child2 extends Parent2{
   /* public Employee m1(){
        System.out.println("child type");
        return null;
    }*/
    public String m1(){
        System.out.println("child type");
        return null;
    }
}
