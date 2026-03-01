package ShortingAlgo;
import java.util.*;

public class BubbleShort {
    public static void bubbleSort(int arr []){
        for(int i =0;i<arr.length-1;i++){
            for(int j = 0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    //SelectionSort
    public static void selectionSort(int arr[]){
        for(int i =0;i<arr.length-1;i++){
            int minPos = i;
            for(int j = i+1;j<arr.length;j++){
                 if(arr[minPos]<arr[j]){
                     minPos = j;
                 }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    //InsertionSort
    public static void insertionSort(int arr[]){
        for(int i = 1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            // finding out the correct position to insert
            while(prev>=0 && arr[prev] >curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }
    public static void printSorttedAlgo(Integer  arr[]){
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer arr[] ={5,4,1,3,2};
       Arrays.sort(arr,0,5,Collections.reverseOrder());
        printSorttedAlgo(arr);
    }
}
