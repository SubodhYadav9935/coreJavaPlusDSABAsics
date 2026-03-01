package Chapter2.video2_3;

public class Test3 {
    Object o = null;
    String s =null;
    public void m1(int i){
        System.out.println("int args");
    }
    public void m1(float f ){
        System.out.println("float args");
    }
    public void m1(double d){
        System.out.println("double args");
    }
    public void  m1(String s){  
        System.out.println("Object args");
    }
    public void  m1(Object o){
        System.out.println("Object args");
    }

    public static void main(String[] args) {
        Test3 t = new Test3();
        t.m1(343.34);
        t.m1(null);
    }
}
