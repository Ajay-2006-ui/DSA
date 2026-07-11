package programming;
import programming.Node;
public class InorderAutomaticTraversal {
    // Insert node automatically
    public static Node insert(Node root, int val) {

        if (root == null) {
            return new Node(val);
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    // Inorder traversal
    public static void inorder(Node root) {

        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        Node root = null;

        int[] values = {5, 3, 7, 2, 4, 6, 8};

        for (int val : values) {
            root = insert(root, val);
        }

        System.out.println("Inorder Traversal:");

        inorder(root);
    }
}


