package DSA;

public class BStInorderPredecessor {
    static Node findMax(Node root) {

        while (root.right != null) {
            root = root.right;
        }

        return root;
    }
    static Node predecessor(Node root, int key) {

        Node pred = null;

        while (root != null) {

            if (key > root.data) {
                pred = root;
                root = root.right;
            }

            else if (key < root.data) {
                root = root.left;
            }

            else {
                // Found the key

                if (root.left != null) {
                    pred = findMax(root.left);
                }

                break;
            }
        }

        return pred;
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

    public static void main(String[]args){
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
        Node Suc= predecessor(root,15);
        System.out.println(Suc.data);


    }
}


