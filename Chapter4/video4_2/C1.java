package Chapter4.video4_2;
import java.lang.reflect.Method;

public class C1 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Object  o = Class.forName("java.lang.String").newInstance();
        System.out.println(o.getClass().getName());
        Method [] methods = o.getClass().getMethods();
        for(Method m : methods){
            System.out.println(m.getName());
        }
    }
}
