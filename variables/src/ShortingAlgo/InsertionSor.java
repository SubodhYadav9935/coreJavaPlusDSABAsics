package ShortingAlgo;

public class InsertionSor {

    public static void main(String[] args) {
        int arr[] = {5,4,3,1,2};
        insertion(arr);

    }

    private static void insertion(int[] arr) {
        for(int i =1;i<arr.length-1;i++){
            int curr=i;
            int prev = i+1;
            while(arr[prev]>=0 && arr[curr]<arr[prev]){
                arr[prev+1] = arr[prev];
                prev --;

            }
            //insert
            arr[prev+1] = curr;



        }
    }
}
