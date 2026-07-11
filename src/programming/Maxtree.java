package programming;

public class Maxtree { public static int max(Node root) {

    if (root == null) {
        return Integer.MIN_VALUE;
    }

    int leftMax = max(root.left);
    int rightMax = max(root.right);

    return Math.max(root.data, Math.max(leftMax, rightMax));
}

    public static void main(String[] args) {

        Node root = new Node(5);

        root.left = new Node(3);
        root.right = new Node(7);

        root.left.left = new Node(2);
        root.left.right = new Node(4);

        root.right.left = new Node(6);
        root.right.right = new Node(8);

        System.out.println(max(root));
    }
}

