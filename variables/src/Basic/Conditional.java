package Basic;

import java.util.Scanner;

class Throwable{

}
public class Conditional extends Throwable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        System.out.println("enter a number ");
            float n = sc.nextFloat();
//            if(n>=0){
//                System.out.println("number is positive "+ n);
//            } else if (n<0) {
//                System.out.println("number is negative  "+ n);
//            }
//            else {
//                System.out.println(" invalid number"+ n);
//            }
        if(n>=100){
            System.out.println("you have a fever ");
        }else {
            System.out.println("no fever");
        }



    }
}
