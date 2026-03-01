package Chapter3.video3_1;

public class Neighbour {
    public static void main(String[] args) {
        byte b = 127;
        short a = b;
         b = (byte)140;
         //representation of binary
         int b1 = 0B1010101;
         int b2 = 0b101010;
        System.out.println(b1);
        // representation octal
        int b3 = 01111;
        int b4 = 01212;
        int b5 = 010;
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        int b6 = 0x1111;
        int b7 = 0x1212;
        int b8 = 0x10;
        System.out.println(b6);
        System.out.println(b7);
        System.out.println(b8);

    }
}
