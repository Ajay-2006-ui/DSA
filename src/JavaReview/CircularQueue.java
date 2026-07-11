package JavaReview;

public class CircularQueue {
    int [] arr;
    int front;
    int rear;
    CircularQueue(int size){
        arr=new int[size];
        front=rear=-1;
    }
    void enqueue(int data){
        if((rear+1)%arr.length==front){
            System.out.println("Queue is full");
            return ;
        }
        if(front==-1){
            front=rear=0;
        }
        else{
            rear=(rear+1)%arr.length;
        }
        arr[rear]=data;
    }
    int dequeue(){
        if(front==-1){
            System.out.println("Queue is empty");
            return -1;
        }
        int data=arr[front];
        if(front==rear){
            front=rear=-1;
        }
        else{
            front=(front+1)%arr.length;
        }
        return data;
    }
    int peek(){
        if(front==-1){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }
    boolean isEmpty(){
        if(front==-1){
            return true;
        }
        return false;
    }
    void display(){
        if(front==-1){
            System.out.println("Queue is empty");
            return;
        }
        int i=front;
        while(true){
            System.out.print(arr[i]+" ");
            if(i==rear){
                break;
            }
            i=(i+1)%arr.length;
        }
        System.out.println();
    }
    public static void main(String[] args){
        CircularQueue q=new CircularQueue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.enqueue(50);
        q.enqueue(60);
        System.out.println(q.peek());
        q.display();
    }
}
