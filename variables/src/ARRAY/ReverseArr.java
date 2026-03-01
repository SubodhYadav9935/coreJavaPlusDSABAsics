package ARRAY;

public class ReverseArr {
    public static void reverseArray(int numbers[]){
        int start = 0;
        int end = numbers.length-1;
        while(start<end){
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }


    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,7};
           reverseArray(numbers);
          //reverseArray
        for (int number : numbers) {
            System.out.print(number + "  ");
        }
    }
}
