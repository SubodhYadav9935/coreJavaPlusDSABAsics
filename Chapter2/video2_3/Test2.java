package Chapter2.video2_3;

public class Test2 {
    public void m1(int i){
        System.out.println("int args1");
    }
    public void m1(float f){
        System.out.println("float args");
    }

    public static void main(String[] args) {
        Test2 t = new Test2();
        t.m1(12);
        t.m1(12.3f);
        t.m1(24L);
        t.m1('a');
//        t.m1(23.4);
//        short s = 2;
//        int a = s;
        // Automatic promotion rule or implicit type casting
        // byte ------> short -----> int (upcast or widening )
        // char ---->int ---->long --->float--->double(upcast or widening)
        // explicit type casting
        int i = 20;
        short s = (short) i;

    }
}
