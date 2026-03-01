package Basic;

public class methods_Functions {
    public static boolean isPrime(int n){
        if (n ==2){
            return true;
        }
        for(int i = 2; i<=Math.sqrt(n);i++){
            if(n%i == 0){
                return false;
            }

        }

        return  true;
    }
    public static void primeNum(int n){
        for(int i = 2;i <= n; i++){
            if(isPrime(i)){
                System.out.print(i+"    ");
            }


        }
    }//
    // binary to decimal code

    public static void binToDec(int binNum){
        int pow = 0;
        int dec = 0;
        while(binNum >0){
           int lastnum = binNum % 10;
           dec =  dec + (lastnum * (int)Math.pow(2,pow) );
           pow++;
           binNum = binNum/10;
        }
        System.out.println("the number is in decimal " + " "+dec);

    }
    // decimal to binary
    public static void decToBin(int decNum){
        int bin=0;
        int pow = 0;
        while(decNum>0){
            int rem = decNum % 2;
            bin=bin +(rem*(int)Math.pow(10,pow));
            pow++;
            decNum = decNum/2;

        }
        System.out.println(bin);
    }
    // even numbers program
    public static void isEven(int n){
        if(n%2==0){
            System.out.println("number is even");
        }
        else {
            System.out.println("number is odd");
        }


    }
    // for palindrome number
    public static int  check(int n){
        int palNum = 0;

        while(n>0){
            int last = n%10;
            palNum = (palNum * 10 )+last;
            n = n/10;

        }
        return palNum;
    }
    public static void palinDrome(int n){
        int palNum = check(n);

        if (n == palNum){
            System.out.println("the nuber is palindrome ");
        }
        else {
            System.out.println("the given number is not palindrome ");
        }


    }


    public static void main(String[] args) {
//       decToBin(10);
//       binToDec(101);
//       primeNum(23);
//       isEven(121);
//       palinDrome(1321);

    }
}
