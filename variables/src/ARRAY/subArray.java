package ARRAY;

public class subArray {
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
        System.out.print(maxSum);
    }
    public static void main(String[] args) {
           int numbers[]= {2,4,6,8,10};
           printSubArray(numbers);
    }
}
