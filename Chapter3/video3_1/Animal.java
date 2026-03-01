package Chapter3.video3_1;
public class Animal {
    public void callme(){
        System.out.println("IN callme of Animal");
    }
}
class Dog extends Animal{
    @Override
    public void callme() {
        System.out.println("In callme of Dog");
    }
    public void callme2(){
        System.out.println("In callme2 of Dog");
    }
}
class UseAnimal{
    public static void main(String[] args) {
        Dog d = new Dog();
        Animal a = (Animal)d;
        d.callme();
        a.callme();
        ((Dog)a).callme2();

    }
}
