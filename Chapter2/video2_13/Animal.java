package Chapter2.video2_13;

public class Animal {
    String name;
    Animal(String name){
        this.name=name;
    }
    Animal(){
        this(makeRandomName());
    }
    private static String makeRandomName(){
        int x = (int) (Math.random()*5);
        String name = new String [] {"fluffy","fido","Rover","spike","giri"}[x];
        return name;
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println(a.name);
        Animal b = new Animal("Tejus");
        System.out.println(b.name);
    }
}
