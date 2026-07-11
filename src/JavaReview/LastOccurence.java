package JavaReview;

public class LastOccurence {
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

    int findLastOccurrence(int key) {

        int count = 0;
        int position = -1;

        if (head == null) {
            System.out.println("The list is empty");
            return -1;
        }

        Node temp = head;

        while (temp != null) {

            count++;

            if (temp.data == key) {
                position = count;
            }

            temp = temp.next;
        }

        return position;
    }
}
class Occurence {
    public static void main(String[] args) {
        LastOccurence l = new LastOccurence();
        l.insertbeg(10);
        l.insertbeg(20);
        l.insertbeg(10);
        l.insertbeg(10);
        l.insertbeg(40);
        System.out.println(l.findLastOccurrence(10));
        System.out.println(l.findLastOccurrence(20));
    }
}

