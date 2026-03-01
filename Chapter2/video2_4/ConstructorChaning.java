package Chapter2.video2_4;

public class ConstructorChaning {
    int z=40;
    ConstructorChaning(){
        super();
        System.out.println("ConstructorChaning");
    }
}
class Child extends ConstructorChaning{
    int size = 67;
    Child(){
        super();
    }

    public static void main(String[] args) {
        Child c = new Child();

    }
}
