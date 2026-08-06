package JavaReview;

public class QueueM {

    int queue[], front, rear;                  // Array to store queue, front & rear pointers

    QueueM(int n) {                            // Constructor to initialize queue
        queue = new int[n];                    // Create queue of size n
        front = rear = -1;                     // Queue is initially empty
    }

    void enqueue(int data) {                   // Insert element into queue

        if (rear == queue.length - 1) {        // Check if queue is full
            System.out.println("Queue is full");
            return;
        }

        if (front == -1) {                     // If first insertion
            front = 0;                         // Set front to first index
        }

        queue[++rear] = data;                  // Increment rear and insert element
    }

    int dequeue() {                            // Remove element from front

        if (front == -1 || front > rear) {     // Check if queue is empty
            System.out.println("Queue is empty");
            return -1;
        }

        int value = queue[front];              // Store front element

        front++;                               // Move front to next element

        if (front > rear) {                    // If queue becomes empty
            front = -1;                        // Reset front
            rear = -1;                         // Reset rear
        }

        return value;                          // Return deleted element
    }

    int peek() {                               // View front element

        if (front == -1 || front > rear) {     // Check if queue is empty
            System.out.println("Queue is empty");
            return -1;
        }

        return queue[front];                   // Return front element
    }

    void display() {                           // Display queue elements

        if (front == -1 || front > rear) {     // Check if queue is empty
            System.out.println("Queue is empty");
            return;
        }

        for (int i = front; i <= rear; i++) {  // Traverse queue
            System.out.println(queue[i] + " "); // Print each element
        }
    }

    public static void main(String[] args) {   // Program execution starts here

        QueueM q = new QueueM(5);              // Create queue of size 5

        q.enqueue(10);                         // Insert 10
        q.enqueue(20);                         // Insert 20
        q.enqueue(30);                         // Insert 30
        q.enqueue(40);                         // Insert 40

        q.dequeue();                           // Remove first element (10)

        q.display();                           // Display remaining queue

        System.out.println(q.peek());          // Print front element

        q.dequeue();                           // Remove 20
        q.dequeue();                           // Remove 30

        q.display();                           // Display remaining queue
    }
}
