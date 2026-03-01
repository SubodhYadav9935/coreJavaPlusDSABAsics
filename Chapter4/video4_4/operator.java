package Chapter4.video4_4;

public class operator {
    public static void main(String[] args) {
        System.out.println(4 & 5);
        System.out.println(4 | 5);
        System.out.println(4 ^ 5);
        System.out.println(true ^ false);
        System.out.println(true ^ true);
        System.out.println(false ^ false);
        System.out.println(false ^ true);
        System.out.println(~3);
//        System.out.println(~true);
        System.out.println(!false);
        System.out.println(!getx());
        System.out.println(4 & 5);
        System.out.println(4 | 5);
        int a ,b;
        a=b=10;
        if(a<b && ++a>b){
            System.out.println("hi");
        }else{
            System.out.println("Radhe Radhe");
        }
        if(a<b || ++a>b){
            System.out.println("hi");
        }else{
            System.out.println("Radhe Radhe");
        }



    }
    public static boolean getx(){
        return true;
    }
}
