package programming;
import java.util.Scanner;
public class Stack {
    int size, top = -1;
    int [] arr;

    Stack(int size) {
        this.size = size;
        arr = new int[size];
    }

    void push(int value) {
        if (top == size - 1) {
            System.out.println("the stack is overflowed");
            return;
        }
        else {
            arr[++top] = value;
        }
    }
    void pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return;

        }
        System.out.println("the popped element is " + arr[top]);
        top--;
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return;
        }
        System.out.println("the peek element is :" + arr[top]);

    }

    void display() {
        if (top == -1) {
            System.out.println("Stack underflow");
        }
        System.out.println("The stack elements are:");
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
class Back{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Stack st= new Stack(2);
        int choice;
        int num;
        while(true){
            System.out.println("\n1.Push \n2.Pop \n3.Peek \n4.Display");
            System.out.println("Enter the choice:");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the value to be inserted:");
                    num=sc.nextInt();
                    st.push(num);
                    break;
                case 2:
                    st.pop();
                    break;
                case 3:
                    st.peek();
                    break;
                case 4:
                    st.display();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid choice");


            }


        }
    }

}
