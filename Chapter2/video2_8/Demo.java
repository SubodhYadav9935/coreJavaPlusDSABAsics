package Chapter2.video2_8;

public class Demo {
    private static String name = "Rajesh";
    private int x = 5;
    public void show(){
        System.out.println(this);
        System.out.println("I am showing ");
        System.out.println(this.name);
        tell();
    }
    public void tell(){
        System.out.println("I am telling ");
        System.out.println(x);
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
    }
}
