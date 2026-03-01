package Chapter4.video4_2;

public class Short {
    public static void main(String[] args) {
        int x = 10 , y = 15 ;
        if(++x < 10 & ++y > 15){
            x++;
        }
        else {
            y++;
        }
        System.out.println(y + "   " + x);
        if(++x < 10 && ++y > 15){
            x++;
        }
        else {
            y++;
        }
        System.out.println(y + "   " + x);

    }
}
