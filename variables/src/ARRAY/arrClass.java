package ARRAY;
import java.util.*;

public class arrClass {
    public static void Update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i] = marks[i] + 2;
        }

    }
    public static void main(String[] args) {
//        int marks[] = new int[100];
//        Scanner sc = new Scanner(System.in);
//        marks[0] =sc.nextInt();
//        marks[1] =sc.nextInt();
//        marks[2] =sc.nextInt();
//        int total = (marks[0]+marks[1]+marks[2])/3;
//        System.out.println(total+"%");
        //arrays as function argument
        int marks[] = { 95,83,43};
        Update(marks);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]+ " ");
        }
        System.out.println();




    }
}
