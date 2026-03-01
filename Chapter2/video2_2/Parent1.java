package Chapter2.video2_2;

public class Parent1 {
    public void m1(){
        System.out.println("Parent Method");
    }
}
class Child1 extends Parent1{
    public void M1() {
        System.out.println("Child method");
    }
}
class Test1{
    public static void main(String[] args) {
        Parent1 p = new Parent1();
        p.m1();
        Parent1 p1 = new Child1();
        p.m1();
    }
}
