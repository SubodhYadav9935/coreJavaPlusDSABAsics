package Bitminupulation;

public class OddOrEven {
    public static void oddEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("number is even");
        }else{
            System.out.println("number is odd");
        }
    }
    public static int Ithbit(int n , int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0 ;
        }else{
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(Ithbit(10,2));
    }
}
