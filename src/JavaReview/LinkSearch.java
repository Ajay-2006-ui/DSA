package JavaReview;

public class LinkSearch {
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
        while (temp.next!= null) {
            temp = temp.next;
        }
        temp.next= newNode;
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

        System.out.println();
    }

    int search(int value) {
        Node temp = head;
        int position=1;
        while (temp != null) {
            if (temp.data == value) {
                return position;
            }
            temp = temp.next;
            position++;

        }
        return -1;
    }
    public static void main(String[] args) {
        LinkSearch ls = new LinkSearch();
        ls.insertbeg(10);
        ls.insertbeg(25);
        ls.insertbeg(40);
        ls.insertEnd(55);
        ls.insertEnd(70);
        ls.traversal();
       System.out.print( ls.search(55));
    }

 }
