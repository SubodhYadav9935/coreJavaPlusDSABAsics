package Chapter2.video2_7;

public class Object {}
class Base1 extends Object{}
class Base2 extends Object{}
class Der1 extends Base1{}
class Der2 extends Base1{}
class Der3 extends Base2{}
class Der4 extends Base2{}
class chilli extends Der4{}

class Test{
    public static void main(String[] args) {
        Base2 b =  new Der4();
        Der4 d = (Der4)b;
//        Base1 c =  (Base1)b; //inconvertible type beacuse there is no parent child relationship
        Base2 b1 = (Base2) b;
        Object o = (Der3)b;
//        Base2 b2 = (Base1)b;
    }
}
