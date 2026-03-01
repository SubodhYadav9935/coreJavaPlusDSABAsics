package Chapter2.video2_2;

public class Parent3 {
    private void m1(){
        System.out.println("Parent method");
    }

}
class Child3 extends Parent3{
    private void m1(){
        System.out.println("Child method");
    }
}
class Test3{
    public static void main(String[] args) {
        Parent3 p = new Parent3();
//        p.m1();
        Parent3 p1 = new Child3();
//        p1.m1();
    }
}
