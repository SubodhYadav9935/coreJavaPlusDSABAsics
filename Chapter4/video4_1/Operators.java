package Chapter4.video4_1;

public class Operators {
    public static void main(String[] args) {
        // increment operators
        // decrement operators
        int x = 10 ;
        int y = ++x;
        System.out.println(y);
        final int e = 10;
//        e++;
        System.out.println(e);
        char ch = 'a';
        System.out.println(++ch);
        System.out.println('a' + 'b');
        //arithmetic operator
        byte a = 2;
        byte b = 3;
//        byte c = a+b;   // byte + byte =  int
        byte v = 3;
        short n = 12;
//        short g= v+n;   // byte + short =  int
// maxof(int ,type1 , type2) int these three if any one is maximum in size then whole value will be of that type
        System.out.println(10/0.0);
        System.out.println(-10/0.0);
        System.out.println(0/10.0);
//        System.out.println(0/0);
        System.out.println(0/0.0);
        System.out.println(0.0/0.0);
        System.out.println(-0.0/0);
        System.out.println(-0.0/0.0);
        System.out.println(10<20);
        // Equality operators
        System.out.println(1==2);
        System.out.println(1!=2);
        System.out.println(1==1);
        System.out.println(1>=0);
        System.out.println('a'=='b');
        System.out.println(false==false);
        System.out.println(true==false);
        String s = new String("aman");
        String r = new String("aman");
        System.out.println(s==r);
        System.out.println(s.equals(r));

    }
}
