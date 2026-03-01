//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("this is a good way \n to witting the code ");
        byte b = 4;
        char c ='a';
        short s=512;
        int i = 1000;
        float f = 3.14f;
        double d=99.9954;
        double result =(f*b) + (i % c) -( d * s);
        System.out.println(result);
        long a = 10L;
        float r = 5.5f;
        float res = a + r; // a is promoted to float, and the result is float

        System.out.println(res); // Output: 15.5


    }
}
