package Chapter4.video4_3;

interface Machine{
}
class Vehicle implements Machine{}

class Car extends Vehicle{}
class Toy{

}

class InstanceOfDemo {

    public static void main(String[] args) {
        Machine m = new Vehicle();
        Machine m2 = new Car();
        Vehicle v = new Car();
        Car c1 = new Car();
        Car c2 = new Car();
        Car[] carr = new Car[]{c1, c2};
        Car c = new Car();
        System.out.println("c instanceof Machine" + (c instanceof Machine));
        System.out.println("n instanceof Vehicle:" + (m instanceof Vehicle));
        System.out.println("n2 instanceof Car" + (m2 instanceof Car));
        System.out.println("m instanceof Car" + (v instanceof Car));
        System.out.println("c instanceof Vehicle:" + (c instanceof Vehicle));
        System.out.println("v instanceof Machine:" + (v instanceof Machine));
        System.out.println("v instanceof Car" +(v instanceof Car));
        System.out.println("null intsance of Object" +(null instanceof Object));
        System.out.println("carr[1] instanceof Car:" + (carr[1] instanceof Car));
        System.out.println("carr instanceof Car:" + (carr instanceof Object));


    }
}

