package Chapter2.video2_4;

public class CounterDemo {
    private static int count = 0;
    public CounterDemo(){
        count++;
    }

    public static void main(String[] args) {
        CounterDemo c = new CounterDemo();
        CounterDemo d = new CounterDemo();
        CounterDemo e = new CounterDemo();
        System.out.println(count);
    }
}
