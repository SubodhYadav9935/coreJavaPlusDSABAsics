package Chapter2.video2_8;

public class A11 {
    A11 (){
        print();
    }
    void print(){
        System.out.println("A");
    }
}
class B11 extends A11{
    int i = 4;

    public static void main(String[] args) {
        A11 a  = new B11();
        a.print();
    }
    void print(){
        System.out.println(i);
    }
}