package Chapter2.video2_10;

public class SingletonDemo {
    private SingletonDemo(){

    }
    private static SingletonDemo INSTANCE = null;
    public static SingletonDemo getINSTANCE(){
        if(INSTANCE == null){
            INSTANCE = new SingletonDemo();
        }
        return INSTANCE;
    }
}
class TestSingletonDemo{
    public static void main(String[] args) {
        TestSingletonDemo t = new TestSingletonDemo();
//        t.getSingletonInstance();
        System.out.println(SingletonDemo.getINSTANCE());
        System.out.println(SingletonDemo.getINSTANCE());

    }
}
