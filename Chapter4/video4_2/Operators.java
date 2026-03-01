package Chapter4.video4_2;

public class Operators {
    public static void main(String[] args) {
        Thread t = new Thread();
        if(t instanceof Thread){
            System.out.println("true");
        }
        System.out.println(t instanceof Object);
        System.out.println(t instanceof Runnable);
//        System.out.println(t instanceof String);
        System.out.println(null instanceof Thread);
        System.out.println(null instanceof Object);

        System.out.println(null instanceof Runnable);


    }
}
