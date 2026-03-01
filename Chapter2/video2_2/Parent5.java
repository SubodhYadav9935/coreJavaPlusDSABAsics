package Chapter2.video2_2;

public class Parent5 {
    public final void m1(){ // if method is final we can't override
        System.out.println("Parent Method");
    }
}
class Child5 extends Parent5{
   /* public void m1(){
        System.out.println("ERROR-404");
    }*/
}
