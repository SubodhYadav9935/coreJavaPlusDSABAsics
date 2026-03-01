package Chapter2.video2_5;
import java.util.Scanner;

import static java.lang.System.out;

public class DebugDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        for(int i = 0;i<3;i++){
            out.println("Enter number ");
            sum = sum + sc.nextInt();
        }
        double avg = sum/3;
        out.println("Average os three number"+avg);

    }

}
