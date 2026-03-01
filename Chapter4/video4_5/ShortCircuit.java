package Chapter4.video4_5;

public class ShortCircuit {
    public static void main(String[] args) {
        int x = 15;int y = 10;
        if(++x>10 & ++y<15){
            x++;
        }else{
            y++;
        }
        if(++x>10 | ++y<15){
            x++;
        }else{
            y++;
        }
        if(++x>10 ^ ++y<15){
            x++;
        }else{
            y++;
        }
        if(++x>10 || ++y<15){
            x++;
        }else{
            y++;
        }
        if(++x>10 && ++y<15){
            x++;
        }else{
            y++;
        }


        System.out.println(++x + "............."+ ++y);
    }
}
