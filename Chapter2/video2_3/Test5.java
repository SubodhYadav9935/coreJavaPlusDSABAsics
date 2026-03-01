package Chapter2.video2_3;

public class Test5 {
    void m1(float f , int i){
        System.out.println("int float");
    }
    void m1(int i , float f){
        System.out.println("float int");
    }

    public static void main(String[] args) {
        Test5 t = new Test5();
        t.m1(10,1.1f);
        t.m1(12.2f,12);
//        t.m1(22,22);      // ambiguous method
//        t.m1(2.2f,22f);   // ambiguous method
    }
}
