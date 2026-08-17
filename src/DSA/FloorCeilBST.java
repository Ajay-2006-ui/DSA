package DSA;

public class FloorCeilBST {

    static int  Floor(Node root, int key) {
        int  ans = -1;
        while (root != null) {
            if (root.data == key) {
                return root.data;
            }
            if (root.data < key) {
                ans = root.data;
                root = root.right;
            } else {
                root = root.left;
            }

        }
        return ans;
    }

    static int  Ceil(Node root, int key) {
        int  ans = -1;
        while (root != null) {
            if (root.data == key) {
                return root.data;
            }
            if (root.data > key) {
                ans = root.data;
                root = root.left;
            } else {
                root = root.right;
            }

        }
        return ans;
    }
    static Node insert(Node root, int value) {

        // If position is empty, create new node
        if (root == null)
            return new Node(value);

        // Smaller value → left
        if (value < root.data) {
            root.left = insert(root.left, value);
        }

        // Larger value → right
        else if (value > root.data) {
            root.right = insert(root.right, value);
        }

        return root;
    }
    public static void main(String[] args) {
        Node root =null;

        // INSERT VALUES
        root = insert(root, 10);
        root = insert(root, 5);
        root = insert(root, 20);
        root = insert(root, 2);
        root = insert(root, 7);
        root = insert(root, 15);
        root = insert(root, 30);
        root = insert(root, 25);
        System.out.println(Floor(root, 13));
        System.out.println(Floor(root, 9));
        System.out.println(Ceil(root, 24));
    }

}
