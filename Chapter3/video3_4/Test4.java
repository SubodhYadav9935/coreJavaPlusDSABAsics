package Chapter3.video3_4;

public class Test4 {
    Test4 i;

    public static void main(String[] args) {
        Test4 t1 = new Test4();
        Test4 t2 = new Test4();
        Test4 t3 = new Test4();
        t1.i = t2;
        t2.i = t3;
        t3.i = t1;
        t1 = null;
        t2 = null;
        t3 = null;
    }
}
