package programming;

public class Vehicle {
    private String brand;
    private String speed;

    Vehicle(String brand, String speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}
   class Car extends Vehicle {
    String fuelType;

       Car(String brand, String speed, String fuelType) {
           super(brand, speed);
           this.fuelType = fuelType;
       }
       void displayInfo() {
           super.displayInfo();
        System.out.println("Fuel Type: " + fuelType);
       }
   }
   class Inheritane{
    public static void main(String[] args) {
        Car f1 = new Car("BMW", "BMW","Diesel");
        f1.displayInfo();
    }
   }
