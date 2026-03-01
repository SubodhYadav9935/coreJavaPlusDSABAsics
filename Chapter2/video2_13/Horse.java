package Chapter2.video2_13;

public class Horse extends Animal{
    private Halter myHalter = new Halter();
    public void tie(LeadRope rope){
        myHalter.tie(rope);
    }
}
