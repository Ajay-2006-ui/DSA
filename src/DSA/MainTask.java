package DSA;
class Task implements Runnable {

    @Override
    public void run() {
        System.out.println("Task is running");
    }
}

    public class MainTask {

        public static void main(String[] args) {

            Task task = new Task();

            Thread t = new Thread(task);

            t.start();
        }
    }

