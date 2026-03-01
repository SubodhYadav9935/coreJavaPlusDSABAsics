package Chapter4.video4_3;

import java.util.ArrayList;
import java.util.List;

public class TypeCastingDemo {

    public static void main(String[] args) {
//        Long l=130;
//        float f =1;
//        int x=y=z=20;
        List list = new ArrayList();
        list.add("Idris");
        list.add(new Student());
        for(Object o: list) {
            if (o instanceof String) {
                System.out.println(((String) o).length());
            } else if (o instanceof Student) {
                ((Student) o).play();
            }
        }
    }
}
class Student {
    void read(){
        System.out.println("student reading ");
    }
    void play(){
        System.out.println("stu playing ");
    }
}