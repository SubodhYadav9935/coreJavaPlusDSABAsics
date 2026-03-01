package Chapter2.video2_12;

public class Animal {
    public static final String SKINCOLOR = "Black";
    public String sound = "Guurr";
    public String makeSound(){
        return sound;
    }


}
class Cat extends Animal{
//    public static final String SKINCOLOR = "Black";
    public String sound = "meow";
    @Override
    public String makeSound(){
//        Cat.SKINCOLOR= "White";
        return sound;
    }

}
class TestOverrideHell{
    public static void main(String[] args) {
        Animal a = new Animal();
        Cat c = new Cat();
        Animal ac = new Cat();
        System.out.println("a.makeSound()" + a.makeSound() +" Value of sound is"+a.sound+ "skin color is"+ a.SKINCOLOR );
        System.out.println("c.makeSound()" + c.makeSound() +" Value of sound is"+a.sound+ "skin color is" + c.SKINCOLOR );
        System.out.println("ac.makeSound()" + ac.makeSound() +" Value of sound is"+a.sound+ "skin color is" + ac.SKINCOLOR );

    }
}