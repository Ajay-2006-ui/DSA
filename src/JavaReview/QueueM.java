package JavaReview;

public class QueueM {
    int queue[], front, rear;

    QueueM(int n) {
        queue = new int[n];
        front = rear = -1;
    }

    void enqueue(int data) {
        if (rear == queue.length - 1) {
            System.out.println("Queue is full");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        queue[++rear] = data;
    }

    int dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return -1;
        }
        int value = queue[front];
        front++;
        if (front > rear) {
            front = -1;
            rear = -1;
        }
        return value;
    }

    int peek() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];

    }

    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
        }
        for (int i = front; i <= rear; i++) {
            System.out.println(queue[i] + " ");
        }
    }

    public static void main(String[] args) {
        QueueM q = new QueueM(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.dequeue();
        q.display();
        System.out.println(q.peek());
        q.dequeue();
        q.dequeue();
        q.display();

    }
}
