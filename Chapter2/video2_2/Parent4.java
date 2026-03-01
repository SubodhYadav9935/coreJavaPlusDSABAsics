package Chapter2.video2_2;

public class Parent4 {
    void m1(){
        System.out.println("Parent method");
    }

}
class Child4 extends Parent4{
    public void m1(){
        System.out.println("Child method");
    }
}
class Test4{
    public static void main(String[] args) {
        Parent4 p = new Parent4();
        p.m1();
        Parent4 p1 = new Child4();
        p1.m1();
    }
}
