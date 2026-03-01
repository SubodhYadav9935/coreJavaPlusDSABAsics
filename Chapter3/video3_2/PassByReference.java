package Chapter3.video3_2;

public class PassByReference {
    public static void main(String[] args) {
        Test pbr = new Test(12);
        modifyScore(pbr);
        System.out.println("score after modification in the calling method   :"+" "+pbr.score);
    }
    private static void modifyScore(Test score){
        score.score=99;
        System.out.println("modifying the value in another method   :"+" " +score.score);
    }

}
class Test{
    int score ;
    public Test(int score){
        this.score=score;
    }
}
