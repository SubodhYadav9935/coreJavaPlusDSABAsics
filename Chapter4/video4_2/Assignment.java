package Chapter4.video4_2;

public class Assignment {


    public static void main(String[] args) {
        int x = 10;
        int a,y,z;
        a= y = z=10;
        // compound assignment
        int d= 3;
         d+=10;
//        int b = c = e= f = 20; //compilation error because using without declaring ;
        byte b = 127;
        b++; // it automatically type casts
        System.out.println(b);
        byte c = 127;
        c = (byte)(c+1); //  it is not automatically type casts
    }
}
