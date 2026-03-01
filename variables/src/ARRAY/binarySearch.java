package ARRAY;

public class binarySearch {
    public static int bSearch(int numbers[],int key){
        int start = 0;
        int end = numbers.length-1;
        while(start<=end){
            int mid = (start + end)/2;
            if(numbers[mid] == key){
               return mid ;

            }if(numbers[mid]>key){
                end = mid -1;
            }
            else{
                start = mid+1;

            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers [] = {1,23,5,332,54,32};
        int key =54;
        int index =  bSearch(numbers , key);
        System.out.println("index is " + " = " + index);

    }
}
