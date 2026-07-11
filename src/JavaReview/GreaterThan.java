package JavaReview;

public class GreaterThan {
    Node head;

    void insertbeg(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    int sumGreaterThan(int key){
        Node temp = head;
        int sum = 0;
        if (head == null) {
            System.out.println("The list is empty");
            return -1;
        }

        while (temp != null) {
            if (temp.data > key) {
                sum += temp.data;
            }
            temp = temp.next;

        }
        return sum;
    }
    public static void main(String[] args) {
        GreaterThan g = new GreaterThan();
        g.insertbeg(20);
        g.insertEnd(25);
        g.insertEnd(45);
        g.insertEnd(65);
        g.insertbeg(90);
        g.insertEnd(15);
        System.out.println(g.sumGreaterThan(25));
    }

}
