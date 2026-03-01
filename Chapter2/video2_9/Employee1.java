package Chapter2.video2_9;

public class Employee1 {
    void swipeCard(){
        System.out.println("Swiping Card");
    }
    void teaBreak(){
        System.out.println("tea break");
    }
}
class Manager1 extends Employee1{
    Vehicle v;

    public void setVehicle(Vehicle v) {
        this.v = v;
    }

    public Vehicle getVehicle() {
        return v;
    }

    void performaneReview(){
        System.out.println("Reviewing the performance the team ");
    }
    Manager1(Vehicle v){
        this.v=v;
    }
}
interface Vehicle{
    void drive();
}
class Car1 implements Vehicle{
    String model;
    Car1(String model){
        this.model=model;
    }
    public void drive(){
        System.out.println("car facility only for manager ");
    }
    void getModel(){
        System.out.println(model);
    }
}
class Aeroplane implements Vehicle{
    public void drive(){
        System.out.println("I am flying the aeroplane ");
    }
}
class ClientDemo1{
    public static void main(String[] args) {
        Manager1 m1 = new Manager1(new Aeroplane());
        m1.getVehicle().drive();
    }

}

