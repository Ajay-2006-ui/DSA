package programming;
import java.util.Scanner;

public class rqueue {
    int size = 0, rear = -1, front = 0, capacity;
    int[] arr;

    rqueue(int size) {
        this.capacity = size;
        arr = new int[size];
    }

    void enque(int value) {
        if (size == capacity) {
            System.out.println("queue is overflow");
            return;
        }
        rear++;
        arr[rear] = value;
        size++;
    }

    void deque() {
        if (size == 0) {
            System.out.println("Queue underflow");
            return;
        }
        int digit = arr[front];
        System.out.println("The removed queue element is:" + digit);
        front++;
        size--;
    }

    void peek() {
        if (size == 0) {
            System.out.println("queue underflow");
            return;
        }
        System.out.println("the top element is:" + arr[rear]);

    }

    void display() {
        if (size == 0) {
            System.out.println("Queue underflow");
        } else {
            for (int i =front;i<=rear;i++){
                System.out.println(arr[i]);
            }
        }
    }

    boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }
}
class FIFO{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        rqueue sq=new rqueue(4);
        int choice;
        while(true){
            System.out.println("\n1.enque\n2.deque \n3.peek \n4.display \n5.emptyt \n6.exit");
       System.out.println("enter the cjoice");
       choice = sc.nextInt();
            switch(choice){

                case 1:
                    System.out.println("enter the number");
                    int num=sc.nextInt();
                    sq.enque(num);
                    break;
                case 2:
                    sq.deque();
                    break;
                case 3:
                    sq.peek();
                    break;
                case 4:
                    sq.display();
                    break;
                case 5:
                    System.out.println(sq.isEmpty());
                case 6:
                    System.exit(0);
                default:
                    System.out.println("invalid choice");
            }
        }
    }
}
