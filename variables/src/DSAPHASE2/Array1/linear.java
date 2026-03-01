package DSAPHASE2.Array1;

public class linear {
    public static void linearSearch(int []num,int key){
        for(int i=0;i< num.length;i++){
            if(num[i]==key){
                System.out.println(i);
            }
        }
    }
    public static void largest(int []num,int key){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i< num.length;i++){
            if(num[i]>largest){
                largest=num[i];
            }

        }
        System.out.println(largest);
    }
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
        int []number= {2,4,6,7,9,8,3};
        int key = 9;
        System.out.println(bSearch(number,key));
    }
}
