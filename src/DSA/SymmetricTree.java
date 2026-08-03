package DSA;

public class SymmetricTree {

    static boolean isSymmetric(Node left, Node right) {

        if (left == null && right == null)
            return true;

        if (left == null || right == null)
            return false;

        return left.data == right.data
                && isSymmetric(left.left, right.right)
                && isSymmetric(left.right, right.left);
    }

    public static void main(String[] args) {

        Node root = new Node(10);

        root.left = new Node(5);
        root.right = new Node(5);

        root.left.left = new Node(2);
        root.left.right = new Node(7);

        root.right.left = new Node(7);
        root.right.right = new Node(2);

        System.out.println(isSymmetric(root.left, root.right));
    }
}
