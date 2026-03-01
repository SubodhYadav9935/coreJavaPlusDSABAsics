package ARRAY;

public class LargestNUM {
    public static int getLarge(int numbers[]){
        int largeNum = Integer.MIN_VALUE;
        int Smalest = Integer.MAX_VALUE;
        for(int i =0;i<numbers.length;i++){
            if(largeNum < numbers[i]){
                largeNum = numbers[i];
            }if(Smalest >numbers[i]){
                Smalest = numbers[i];
            }
        }
        System.out.println("smallest number is" +" "+ Smalest);
        return largeNum;
    }

    public static void main(String[] args) {
        int numbers[ ] = {1,23,5,34,54,23};
        int largeValue = getLarge(numbers);
        System.out.println("large value of this array is "+" " + largeValue);
    }
}
