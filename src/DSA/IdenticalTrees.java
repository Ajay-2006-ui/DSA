package DSA;

public class IdenticalTrees {

    static boolean isIdentical(Node root1, Node root2) {

        // Both trees are empty
        if (root1 == null && root2 == null)
            return true;

        // One tree is empty and the other is not
        if (root1 == null || root2 == null)
            return false;

        // Check current node, left subtree and right subtree
        return root1.data == root2.data
                && isIdentical(root1.left, root2.left)
                && isIdentical(root1.right, root2.right);
    }

    public static void main(String[] args) {

        // Tree 1
        Node root1 = new Node(10);

        root1.left = new Node(5);
        root1.right = new Node(20);

        root1.left.left = new Node(2);
        root1.left.right = new Node(7);

        // Tree 2
        Node root2 = new Node(10);

        root2.left = new Node(5);
        root2.right = new Node(20);

        root2.left.left = new Node(2);
        root2.left.right = new Node(7);

        System.out.println(isIdentical(root1, root2));
    }
}
