package Chapter2.video2_2;

public class Parent {
    public void marry(){
        System.out.println("Amrish Puri has fixed marriage of Simian");
    }
    public void property(){
        System.out.println("millions of Pond");
    }
}
class Child extends Parent{
    public void marry(){
        System.out.println("diwale dulhaniya le jayenge ");
    }
}
class Test{
    public static void main(String[] args) {
        Parent p = new Parent();
        p.marry();
        Child c= new Child();
        c.marry();
        Parent p1 = new Child();
        p1.marry();
    }
}