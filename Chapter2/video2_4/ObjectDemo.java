package Chapter2.video2_4;

public class ObjectDemo {
    private static int count = 0;
    public ObjectDemo(){
        this(110);
        count++;

    }
    public ObjectDemo(int i){
        count++;
        System.out.println("int arg constructor");
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo();
        ObjectDemo obj1 = new ObjectDemo();
        System.out.println("Number of object created "+count);
    }
}
