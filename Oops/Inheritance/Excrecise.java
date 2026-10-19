class Vehicle {
    void start(){
        System.out.println("Vehicle is starting..........");
    }

}
class Car extends Vehicle{
     void drive(){
         System.out.println("Car is driving......");
     }
}
public class Excrecise {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.start();
        c1.drive();
    }
}