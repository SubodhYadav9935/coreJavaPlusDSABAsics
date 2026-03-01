package DSAPHASE2.Day8;



class SpiralMatrix {
    
    public static void spiralMatrix(int matrix[][]){
        int startRow = 0;
        int endRow = matrix.length-1;
        int startCol = 0;
        int endCol = matrix[0].length-1;
        while(startRow<=endRow && startCol<=endCol){
            for(int j = startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j] +" ");
            }
            for(int i = startCol+1;i<=endCol;i++){
                System.out.print(matrix[i][endCol] +" ");
            }
            for(int j = endCol-1;j>=startCol;j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            for(int i =endRow-1;i>=startRow+1;i--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;

        }
        System.out.println();
    }
    public static void bool(int []a[]){
        int startRow =0;
        int startCol = 0;
        int endRow = a.length-1;
        int endCol = a[0].length-1;
        while(startRow<=endRow && startCol<=endCol){
            for ( int j = startCol; j <= endCol; j++) {
                System.out.println(a[startRow][j]);
            }
            for (int i = startRow+1; i <=endRow; i++) {
                System.out.println(a[i][endCol]);
            }
            for (int j = endCol-1; j >=startCol ; j--) {
                System.out.println(a[endRow][j]);
            }
            for (int i = endRow-1; i >=startRow+1 ; i--) {
                System.out.println(a[i][startCol]);

            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;



        }


    }

    public static void daigonalSum(int a[][]){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if(i==j){
                    sum+=a[i][j];
                }
                if(i+j==a.length-1){
                    sum+=a[i][j];
                }

            }

        }
        System.out.println(sum);
    }
    public static void daigonalSum2(int a[][]){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i][i];
            if(i!= a.length-i-1){
                sum+=a[i][a.length-1-i];
            }
        }
        System.out.println(sum);
    }


    public static void main(String[] args) {
        int [][]matrix = {{1,2,3,4 },{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        daigonalSum2(matrix);
    }


}
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int sum;
        for(int i =0,j=1;i<nums.length;i++,j++){
            sum= nums[i]+nums[j];
            if(sum==target){
                return new int[] {i,j};
            }
        }
        return new int []{-1};

    }
    public static void main(String ...arg){
        int[] nums={2,7,11,15};
        int key =9;
        twoSum(nums,key);
    }

}


