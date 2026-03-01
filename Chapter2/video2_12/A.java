package Chapter2.video2_12;

public class A {
    static void m1(){
        System.out.println("parent static method m1");
    }
}
class B extends A{
    static void m1(){
        System.out.println("child static method m1");
    }
}
class Test1{
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        A obj3 = new B();
    }
}
