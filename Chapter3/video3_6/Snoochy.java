package Chapter3.video3_6;

public class Snoochy {
    Boochy booch;
    public Snoochy(){
        booch = new Boochy(this);
    }
}
class Boochy{
    Snoochy snooch;
    public Boochy(Snoochy s){
        snooch = s;
    }

    public static void main(String[] args) {
        Snoochy snoog = new Snoochy();
        snoog = null;
    }
}
