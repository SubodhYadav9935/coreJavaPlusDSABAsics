package Chapter3.video3_5;

public class Beta {
    public static void main(String[] args) {
        Alpha am1 =new Alpha(4);
        Alpha am2 =new Alpha(4);
        Alpha []ar = fill(am1,am2);
        System.out.println(ar[0]);
        System.out.println(ar[1]);
    }
    static Alpha[] fill(Alpha a1,Alpha a2){
        a1.val=2;
        Alpha [] fa = new Alpha[]{a1,a2};
        return fa;
    }
}
class Alpha{
    int val;
    Alpha(int val){
        this.val= val;
    }
    static Beta b = new Beta();
    static int sval = 200;

}
