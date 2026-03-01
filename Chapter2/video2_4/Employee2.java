package Chapter2.video2_4;

public class Employee2 {
    static void method(Integer i){
        System.out.println(1);
    }
    static void method(Double i){
        System.out.println(2);
    }
    static void method(Object i){
        System.out.println(3);
    }
    static void method(Number i){
        System.out.println(4);
    }

    public static void main(String[] args) {
       method((short)12);
    }
}
