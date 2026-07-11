package JavaReview;

public class EvenNodes {
    Node head;
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

        void insertbeginning(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
    int traversal() {
            int count=0;
        if (head == null) {
            System.out.println("The list is empty");
            return 0;
        }

        Node temp = head;

        while (temp != null) {
            int num=temp.data;
            if (num%2==0) {
                count++;
            }
            temp = temp.next;

        }
        return count;

    }
    public static void main(String[] args) {
            EvenNodes obj = new EvenNodes();
            obj.insertbeginning(1);
            obj.insertbeginning(2);
            obj.insertbeginning(3);
            obj.insertbeginning(4);
            obj.insertbeginning(5);
            System.out.println(obj.traversal());
    }

}
