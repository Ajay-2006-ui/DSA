package JavaReview;

class Vehicl {
    void startVehicle() {
        System.out.println("Vehicle started");
    }
}

// Car extends Vehicle AND implements Runnable
class Carr extends Vehicl implements Runnable {

    @Override
    public void run() {
        System.out.println("Car task is running");
    }
}

public class ThreadFu {

    public static void main(String[] args) {

        Carr car = new Carr();

        // Car inherited startVehicle() from Vehicle
        car.startVehicle();

        // Car is a Runnable task
        Thread t = new Thread(car);

        // Start the separate thread
        t.start();
    }
}

