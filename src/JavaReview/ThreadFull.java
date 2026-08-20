package JavaReview;


 class BankAcount {

    private int balance = 1000;

    // synchronized prevents both threads
    // from executing this method at the same time
    synchronized void withdraw(int amount) {

        System.out.println(
                Thread.currentThread().getName()
                        + " entered withdraw()"
        );

        if (balance >= amount) {

            System.out.println(
                    Thread.currentThread().getName()
                            + " is withdrawing ₹" + amount
            );

            // Just to make the situation easier to observe
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                System.out.println("Interrupted");
            }

            balance = balance - amount;

            System.out.println(
                    "Remaining balance: ₹" + balance
            );

        } else {

            System.out.println(
                    Thread.currentThread().getName()
                            + " → Insufficient balance"
            );
        }
    }
}


public class ThreadFull {

    public static void main(String[] args) {

        // ONE BankAccount object
        BankAcount account = new BankAcount();

        // Thread 1 uses the same account
        Thread t1 = new Thread(
                () -> account.withdraw(700),
                "Thread-1"
        );

        // Thread 2 uses the SAME account
        Thread t2 = new Thread(
                () -> account.withdraw(700),
                "Thread-2"
        );

        // Both threads start
        t1.start();
        t2.start();
    }
}