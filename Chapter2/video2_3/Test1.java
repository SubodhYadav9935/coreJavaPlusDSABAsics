package Chapter2.video2_3;

public class Test1 {
    public int m1(String s ,int i){
        return 5;

    }
    public String m1(int i){
        return "aman";
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.m1("ama",2);  // ambiguous method if args are same
    }
}
