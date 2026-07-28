package DSA;

public class BinaryDiameter {


    static int diameter(Node root) {

        if (root == null)
            return 0;

        int leftHeight =TreeHeight. height(root.left);
        int rightHeight =TreeHeight.height(root.right);

        int throughRoot = leftHeight + rightHeight + 2;

        int leftDiameter = diameter(root.left);
        int rightDiameter = diameter(root.right);

        return Math.max(throughRoot,
                Math.max(leftDiameter, rightDiameter));
    }
    public static void main(String[] args) {
        Node root = new Node(10);

        root.left = new Node(5);
        root.right = new Node(20);

        root.left.left = new Node(2);
        root.left.right = new Node(7);

        root.right.left = new Node(15);
        root.right.right = new Node(30);

        System.out.println(diameter(root));
    }

}