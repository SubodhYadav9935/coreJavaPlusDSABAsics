package Chapter3.video3_3;

import java.awt.Dimension;

public class ReferenceTest {
    public static void main(String[] args) {
        Dimension d = new Dimension(5,10);
        System.out.println("d.height"+d.height);
        Dimension d1 = d;
        d1.height= 30;
        System.out.println(" After changing "+d.height);
    }
}
