package Chapter3.video3_4;

public class Test2 {
    private Test2(String name){
    }
    public static void main(String[] args) {
        Test2 s =new Test2("Subodh");
        s = null;
        System.gc();
        System.out.println("End of main");
    }
    public void finalize(){
        System.out.println("Finalize method called");
    }
}
