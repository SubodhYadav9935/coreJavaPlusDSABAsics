package ShortingAlgo;

public class MergeSort {
    public static void main(String[] args) {
        int ar[] = {1,5,2,6,3,7};
        int si;
        int ei;
        mergeSort(ar,si=0,ei = ar.length-1);
        printar(ar);
    }
    public static void printar(int []ar){
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]+ " ");
        }
    }

    private static void mergeSort(int[] ar, int si, int ei) {
        if(si>=ei){
            return;
        }
        int mid = si+(ei -si)/2;
        mergeSort(ar,si,mid);// left sorted
        mergeSort(ar,mid+1,ei); // right sorted
        merge(ar,si,mid,ei);
    }
    public static void merge(int ar[],int si,int mid,int ei){
        int temp[] = new int[ei -si +1];
        int i = si;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=ei){
            if(ar[i]<ar[j]){
                temp[k] = ar[i];
                i++;
            }else {
                temp[k] =ar[j];
                j++;
            }
            k++;

        }
        // for left remaining elements
        while(i<=mid){
            temp[k++] = ar[i++];
        }
        //for right remaining elements
        while (j<=ei){
            temp[k++] = ar[j++];
        }
        for(k =0,i=si;k<temp.length;k++,i++){
            ar[i] = temp[k];
        }
    }
}
