class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting ");
    }
}
class Bike extends Vehicle {
  @Override
    void start() {
        System.out.println("Bike is starting ");
    }
}
public class VehicleTest {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        myCar.start();  // 
        myBike.start(); // 
}
}





