package JavaReview;

public class Vehicle {
    protected String brand;

    Vehicle(String brand) {

        this.brand = brand;
    }

    void start() {

        System.out.println("Vehicle started");
    }

}

    class Car extends Vehicle {

        Car(String brand) {

            super(brand);
        }

        void start() {
            System.out.println("car started");
        }

        void displayBrand() {
            System.out.println("Brand: " + brand);
        }

        public static void main(String[] args) {
            Car c = new Car("Toyota");
            c.displayBrand();
            c.start();
        }
    }

