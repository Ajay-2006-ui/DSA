package JavaReview;



public class ThreadFull extends Thread {

    // This is the method that the new thread executes
    @Override
    public void run() {

        // Calling a non-static method from a non-static method
        method1();

        // Calling a static method from a non-static method
        method2();
    }

    // Non-static method
    void method1() {
        System.out.println("Non-static method 1");
    }

    // Static method
    static void method2() {
        System.out.println("Static method 2");

        // Calling another static method
        method3();
    }

    // Static method
    static void method3() {
        System.out.println("Static method 3");
    }

    public static void main(String[] args) {

        // Create ThreadFull object
        ThreadFull t = new ThreadFull();

        // Start a new thread
        t.start();
    }
}