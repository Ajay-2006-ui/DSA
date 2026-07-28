package DSA;
public class BalancedTree {

    static int checkHeight(Node root) {

        // Base Case
        if (root == null)
            return -1;

        // Check left subtree
        int leftHeight = checkHeight(root.left);

        // If left subtree is already unbalanced,
        // no need to check anything else.
        if (leftHeight == -2)
            return -2;

        // Check right subtree
        int rightHeight = checkHeight(root.right);

        // If right subtree is already unbalanced,
        // no need to continue.
        if (rightHeight == -2)
            return -2;

        // Check current node
        if (Math.abs(leftHeight - rightHeight) > 1)
            return -2;

        // Return height if balanced
        return 1 + Math.max(leftHeight, rightHeight);
    }

    static boolean isBalanced(Node root) {
        return checkHeight(root) != -2;
    }

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(5);
        root.left.left = new Node(2);
        root.left.left.left = new Node(1);

        if (isBalanced(root))
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }
}