package JavaReview;


public class FirstOccurence  {
    Node head;
    void insertbeg(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void FirstOccur(int key) {
        if (head == null) {
            return;
        }
        if(head.data == key){
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data == key) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }
    void traversal() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        FirstOccurence f=new FirstOccurence();
        f.insertbeg(10);
        f.insertbeg(20);
        f.insertbeg(30);
        f.insertbeg(20);
        f.insertbeg(40);
        f.FirstOccur(20);
        f.traversal();
    }
}
