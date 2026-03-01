package Chapter2.video2_3;
import static java.lang.System.out;

public class Test6 {
    void m1(int e){
        System.out.println("int float");
        out.print(e);
    }
    void m1(int ...x){
        System.out.println("float int");
    }

    public static void main(String[] args) {
        Test6 t = new Test6();
        t.m1();
        t.m1(2302,23,23,23121,34,4,3434,2324,4,4433);
        t.m1(12);
    }
}
