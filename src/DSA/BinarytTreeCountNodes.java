package DSA;

public class BinarytTreeCountNodes {
    static int CountNodes(Node root) {
        if (root == null)
            return 0;
        int LeftNodes = CountNodes(root.left);
        int RightNodes = CountNodes(root.right);
        return 1+LeftNodes+RightNodes;

    }
    public static void main(String[] args) {
        Node root = new Node(10);

        root.left = new Node(5);
        root.right = new Node(20);

        root.left.left = new Node(2);
        root.left.right = new Node(7);

        root.right.left = new Node(15);
        root.right.right = new Node(30);

        System.out.println(CountNodes(root));
    }
}
