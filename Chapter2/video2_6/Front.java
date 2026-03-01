package Chapter2.video2_6;

public class Front {
    static void m1(){
        System.out.println("A");
    }
}
class back extends Front{
    static void m1(){   // if we will remove statuc keyword then it will show error like we can't override static method from class Front
        System.out.println("B");
    }
}
class Test1{
    public static void main(String[] args) {
        Front f = new back();
        f.m1();
    }

}
