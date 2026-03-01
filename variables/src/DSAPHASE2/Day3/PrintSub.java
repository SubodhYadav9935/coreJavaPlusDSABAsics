package DSAPHASE2.Day3;
import java.lang.*;
public class PrintSub {
    public static void printSubArray(int numbers[]){
        int currsum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            int start = i;
            for(int j=i;j<numbers.length;j++){
                int end = j;
                currsum=0;
                for( int k =start; k<=end;k++ ){
                    currsum = currsum + numbers[k];
                }
                System.out.println(currsum);
                if(currsum>maxSum){
                    maxSum = currsum;
                }
            }
        }
        System.out.print("maximum sum of sub array is "+maxSum);
    }
    public static void KadansAlgo(int num[]){
        int ms= Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < num.length; i++) {
            cs+=num[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println(ms);

    }

    public static void main(String[] args) {
        int []num = {-2,-3,4,-1,-2,1,5,-3};
//        printSubArray(numbers);
        KadansAlgo(num);
    }
}
