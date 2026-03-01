package DSAPHASE2.Day2;

public class ReverseArr {
    public static void ReverseArr(int num[]){
        int start = 0, end = num.length-1;
        while(start<end){
            int temp =num[ start];
            num[ start]=num[end];
            num[end] = temp;
            start++;
            end--;

        }


    }
    public static void print1(int number[]){
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] +" ");

        }

    }
    public static void subArray(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {

            for (int j = i+1; j < arr.length; j++) {
                System.out.print("("+arr[i] + ","+ arr[j]+")");
            }
            System.out.println();
        }
    }
    public static void subArray1(int arr[]){
        for (int i = 0; i <=arr.length; i++) {

            for (int j=i; j <=arr.length; j++) {
                for (int k = i; k < j; k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        int []numbers = {1,2,3,4,5};
        subArray1(numbers);

    }
}
