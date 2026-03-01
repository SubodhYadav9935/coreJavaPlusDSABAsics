package Chapter2.video2_7;
interface Vehicle{
    void drive();
}
public class Car implements Vehicle {
    public void drive(){
        System.out.println("Car driving ");
    }
}
class Bus implements Vehicle{
    public void drive(){
        System.out.println("Bus driving ");
    }
}
class Test1{
    public static void main(String[] args) {
        /*Car c = new Car();
        c.drive();
        Bus b = new Bus();
        b.drive();*/
        Test1 obj =  new Test1();
        Vehicle v = new Bus();
        obj.move(v);


    }
    void move(Vehicle v) {
        v.drive();
    }

}
