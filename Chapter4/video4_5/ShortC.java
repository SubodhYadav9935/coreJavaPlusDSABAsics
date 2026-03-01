package Chapter4.video4_5;

public class ShortC {
    public static void main(String[] args) {
        int x = 10;int y = 15;
        if(++x < 10 && (x/0 > 15)){

            System.out.println("hi");
        }
        else {
            System.out.println("hello");
        }
    }
}
