package DSA;

public class MaximumValueBinary {
    static int maximumValue(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int left = maximumValue(root.left);
        int right = maximumValue(root.right);
        return  Math.max(root.data,Math.max(left, right));
    }
    public static void main(String[] args) {
        Node root = new Node(10);

        root.left = new Node(5);
        root.right = new Node(20);

        root.left.left = new Node(2);
        root.left.right = new Node(7);

        root.right.left = new Node(15);
        root.right.right = new Node(30);

        System.out.println(maximumValue(root));
    }
}
