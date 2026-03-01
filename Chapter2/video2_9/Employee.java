package Chapter2.video2_9;

public class Employee {
    void swipeCard(){
        System.out.println("Swiping Card");
    }
    void teaBreak(){
        System.out.println("tea break");
    }
}
class Manager extends Employee{
    Car c;
    public Car getCar() {
        return c;
    }
    public void setCar(Car c) {
        this.c = c;
    }
    public Manager(Car c){
        this.c = c;
    }
}
class Car{
    String model;
    Car(String model){
        this.model=model;
    }
    void drive(){
        System.out.println("car facility only for manager ");
    }
    void getModel(){
        System.out.println(model);
    }
}

class ClientDemo{
    public static void main(String[] args) {
        Manager m = new Manager(new Car("Lamborghini Huracan"));
        m.getCar().drive();
        m.getCar().getModel();
    }

}
