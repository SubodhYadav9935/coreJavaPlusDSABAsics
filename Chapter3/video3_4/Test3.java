package Chapter3.video3_4;

public class Test3 {
    private Test3(String name){
    }
    public static void main(String[] args) {
        Test3 s =new Test3("Subodh");
        s.finalize();
        s.finalize();

        System.gc();
        System.out.println("End of main");
    }
    public void finalize(){
        System.out.println("Finalize method called");
    }
}
