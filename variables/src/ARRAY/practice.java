package ARRAY;

public class practice {
    public static int linearSearch(int array[] , int key){
        for(int i = 0;i<array.length;i++){
            if(array[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static int largest(int array[]){
        int largest = Integer.MIN_VALUE;
        for(int i =0;i<array.length;i++){
            if(array[i] > largest){
                largest = array[i];
            }
        }
        return largest;
    }
    public static int bsearch(int array[],int key){
        int start = 0;
        int end = array.length-1;
        for(int i = 0 ; i<array.length-1; i++){
            int mid = (start +end )/2;
            if(key == array[mid]){
                return mid;
            } else if (key < array[mid]) {
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static void swapArray(int array []){
        int start = 0;
        int end = array.length-1;
        for(int i =0;start<end;i++){
            int temp = array[start];
            array[start]=array[end];
            array[end] =temp;
            start++;
            end--;
        }


    }
    public static void printarr(int arr[]){
       for(int i =0 ; i<arr.length;i++){
           System.out.println(arr[i]+ " ");
       }
    }
    public static void kadans(int number[]){
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for(int i = 0;i<number.length-1;i++){
            currsum += number[i];
            if(currsum < 0){
                currsum =0;
            }
            maxsum = Math.max(currsum,maxsum);
        }
        System.out.println(maxsum);

    }

    public static void main(String[] args) {
        int array[] = {-3,-2,4,-1,-2,5,2,-3};

        kadans(array);
        printarr(array);

    }
}

