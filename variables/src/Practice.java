public class Practice {
    public static int linearSearch(int numbers[],int key){
        for(int i = 0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void paredArray(int numbers[]){
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
    public static void printSubArr(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i =0;i<numbers.length;i++){
            int start = i;
            for(int j=i;j<numbers.length;j++){
                int end = j;
                currSum = 0;
                for(int k = start;k<=end;k++){
                    currSum +=numbers[k];
                }
                System.out.print(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
            System.out.println();
        }
        System.out.println(maxSum);
    }
    void go(){

    }

    public static void main(String[] args) {
        new Practice().go();
        System.out.println(6<<1);
        StringBuilder s= new StringBuilder("Aman");
//        s.insert(5,"we");
//        System.out.println(s);
        System.out.println("Aman".intern());
    }
}


