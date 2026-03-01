package DSAPHASE2.Day7;

import org.w3c.dom.ls.LSOutput;

public class SelectionSort {
    //SelectionSort
    public static void selectionSort(int arr[]){
        for(int i =0;i<arr.length-1;i++){
            int minPos = i;
            for(int j = i+1;j<arr.length-1;j++){
                if(arr[minPos]>arr[j]){
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void InsertionSort(int arr[]){
        for (int i = 1; i < arr.length ; i++) {
            int curr = arr[i];
            int prev = i-1;
            // correct position to insert the element
            while(prev>=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev --;
            }
            // Inserttion
            arr[prev+1] =curr;


        }

    }


    public static void printSorttedAlgo(int  arr[]){
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] ={5,4,1,3,2};
        InsertionSort(arr);
        printSorttedAlgo(arr);
    }
}


