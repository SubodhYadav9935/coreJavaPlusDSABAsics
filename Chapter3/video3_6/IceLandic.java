package Chapter3.video3_6;
interface  Animal{
    void makeNoise();
}
class Horse implements Animal{
    public void makeNoise(){
        System.out.println("Whinny");
    }
}
public class  IceLandic extends Horse{
    public void makeNoise(){
        System.out.println("vinny");
    }

    public static void main(String[] args) {
        IceLandic i1 =new IceLandic();
        IceLandic i2 =new IceLandic();
        IceLandic i3 =new IceLandic();
        i3 = i1;
        i1=i2;
        i2 = null;
        i3 = null;

    }
}