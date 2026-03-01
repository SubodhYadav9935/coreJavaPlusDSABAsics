package Chapter3.video3_5;

public class Sample {
     private Integer i1 = new Integer(400);

    public static void main(String[] args) {
        Sample s1 = new Sample();
        Sample s2 = new Sample();
        Sample s3 = new Sample();
        s1 = null;
        // hre how many object eligible for garbage collection


    }
    public static Sample modify(Sample s){
        s.i1=new Integer(9);
        s = new Sample();
        s.i1 = new Integer(20);
        s = null;
        return s;
    }

}
