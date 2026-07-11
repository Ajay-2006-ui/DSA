package JavaReview;

public class Stacklinkedlist {
    Node top;

    void push(int value){
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;

    }

    int pop(){
        if(top==null){
            System.out.println("The stacklinkedlist is empty");
            return -1;
        }
        int value=top.data;
        System.out.println("The poped element is:"+value);
        top = top.next;
        return value;
    }

    void peek(){
        if(top==null){
            System.out.println("The stacklinkedlist is empty");
            return;
        }
        System.out.println("The top element is:"+top.data);
    }

    boolean isEmpty(){
        if(top==null){
            return true;
        }
        return false;
    }
    void display(){
        if(top==null){
            System.out.println("The stacklinkedlist is empty");
            return;
        }
        Node temp = top;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }

    }
    public static void main(String[] args) {
        Stacklinkedlist st = new Stacklinkedlist();
        st.push(10);
        st.push(20);
        st.push(30);
        st.pop();
        st.peek();
        st.display();
        st.push(40);
        System.out.println(st.isEmpty());
        st.display();

    }

}