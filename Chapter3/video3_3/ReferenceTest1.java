package Chapter3.video3_3;

import java.awt.Dimension;

public class ReferenceTest1 {
    public static void main(String[] args) {
        Dimension d = new Dimension(5,10);
        ReferenceTest1 rt = new ReferenceTest1();
        System.out.println("d.height before modification"+d.height);
        rt.modify(d);
        System.out.println("d.height"+d.height);

    }

    void modify(Dimension dim) {
        dim.height= dim.height+1;
        System.out.println("dim  = "+ dim.height);
    }
}
