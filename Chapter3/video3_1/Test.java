package Chapter3.video3_1;

public class Test {
    int marks = 70;  // instance variable are created at heap area
    String name = "Anushka";      // instance variable are created  at heap area
    static String courseName = "JAVA";  // static variable are created at method area

    public static void main(String[] args) {
        Test t = new Test();  // object also stored at the heap area
    }
}
