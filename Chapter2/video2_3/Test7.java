package Chapter2.video2_3;

class Animal{}
class Monkey extends Animal{}

class Test7 {
    public void m1(Animal a){
        System.out.println("Animal");
    }
    public void m1(Monkey m){
        System.out.println("Monkey");
    }

    public static void main(String[] args) {
        Test7 t = new Test7();
        Animal an = new Animal();
        t.m1(an);
        Monkey mon = new Monkey();
        t.m1(mon);
        Animal ana = new Monkey();
        t.m1(ana);
    }

}
