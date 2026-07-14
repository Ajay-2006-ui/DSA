package JavaReview;

public class FindMax {
    Node head;

    // Insert at end
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

    // Insert at beginning
    void insertbeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at a given position (1-based indexing)
    void InsertAtMiddle(int data, int position) {
        Node newNode = new Node(data);

        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;

        // Move to (position - 1)th node
        for (int i = 1; i < position - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }
    int Max(){
        Node temp = head;
        if(head==null){
            return 0;
        }
        int Max=head.data;
        if(head.next==null){
            return Max;
        }
        while(temp!=null){
            if(temp.data>Max){
                Max=temp.next.data;
            }
            temp = temp.next;
        }
        return Max;
    }
    public static void main(String[] args) {
        FindMax obj = new FindMax();
        obj.insertbeginning(10);
        obj.insertbeginning(30);
        obj.insertbeginning(20);
        obj.insertbeginning(40);
        System.out.println(obj.Max());
    }

}
