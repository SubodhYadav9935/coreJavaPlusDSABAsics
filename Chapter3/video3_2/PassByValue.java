package Chapter3.video3_2;

public class PassByValue {
    public static void main(String[] args) {
        int score = 6; // called method
        modifyScore(score);
        System.out.println("score after modification in the calling method"+ score);
    }
    private static void modifyScore(int score){   // calling method
        score += 10;
        System.out.println("modifying the value in another method"+ score);
    }

}
