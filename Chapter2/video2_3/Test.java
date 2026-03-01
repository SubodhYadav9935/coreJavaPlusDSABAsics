package Chapter2.video2_3;

public class Test {
    public void m1(int i){
        System.out.println("Anything");
    }
    public void m1(long l){
        System.out.println("about long");
    }
    public void m1(float f){
        System.out.println("about float");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.m1(3);
        t.m1(23.2f);
        t.m1(10L);
    }
    // this is called overloading ,same method name but different argument
}
