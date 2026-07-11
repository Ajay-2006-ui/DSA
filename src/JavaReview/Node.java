package JavaReview;

public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
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

    // Delete first node
    void DeleteAtBeginning() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }

        head = head.next;
    }

    // Delete last node
    void DeleteAtEnd() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }

        // Only one node
        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        // Move to second last node
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    // Delete node at a given position (1-based indexing)
    void DeleteAtMiddle(int position) {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }

        // Delete first node
        if (position == 1) {
            head = head.next;
            return;
        }

        Node temp = head;

        // Move to (position - 1)th node
        for (int i = 1; i < position - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
    }

    // Search for an element
    boolean Search(int key) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    // Print the linked list
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

        System.out.println();
    }

    void MiddleElement() {
        Node Fast = head;
        Node Slow = head;
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        while (Fast != null && Fast.next != null) {
            Fast = Fast.next.next;
            Slow = Slow.next;
        }
        System.out.println(Slow.data);
    }

    int CountOccurence(int key) {
        int count = 0;
        Node temp = head;
        if(head == null) {
            System.out.println("The list is empty");
            return -1;
        }
        while (temp != null) {
            if (temp.data == key) {
                count++;
            }
            temp = temp.next;
        }
        return count;
    }

}


class Link {
    public static void main(String[] args) {
        LinkedList ls = new LinkedList();

        // Insert at beginning
        ls.insertbeginning(10);
        ls.insertbeginning(20);
        ls.insertbeginning(10);

        System.out.println("After inserting at beginning:");
        ls.traversal();   // 30 20 10

        // Insert at end
        ls.insertEnd(40);
        ls.insertEnd(10);
        ls.insertEnd(60);

        System.out.println("After inserting at end:");
        ls.traversal();   // 30 20 10 40 50 60

        ls.MiddleElement();
        System.out.println(ls.CountOccurence(10));

    }
}