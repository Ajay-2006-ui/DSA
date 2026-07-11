package programming;

import programming.Node;

public class Treesum {
    public static int treeSum(Node root) {

        if (root == null) {
            return 0;
        }

        int leftSum = treeSum(root.left);
        int rightSum = treeSum(root.right);

        return leftSum + rightSum + root.data;
    }

    public static void main(String[] args) {

        Node root = new Node(5);

        root.left = new Node(3);
        root.right = new Node(7);

        root.left.left = new Node(2);
        root.left.right = new Node(4);

        root.right.left = new Node(6);
        root.right.right = new Node(8);

        System.out.println(treeSum(root));
    }
}
