package Chapter2.video2_12;



public class Parent {
    static final int x = 9; // this is called hiding the Data
    void m1(){
        System.out.println("Parent method called ");
    }
}
class Child extends Parent {
    int x= 13;

    void m1(){
        System.out.println("Child method called");
    }
}
class Test {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.m1();
        Child c = new Child();
        c.m1();
        Parent p1 = new Child();
        p1.m1();
        System.out.println(p1.x);
        System.out.println(c.x);
        System.out.println(c.x++);
//        System.out.println(p1.x++);

    }
}
