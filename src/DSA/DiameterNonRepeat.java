package DSA;

public class DiameterNonRepeat {
    static int diameter = 0;

    static int height(Node root){

        if(root==null)
            return -1;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int throughRoot = leftHeight + rightHeight + 2;

        diameter = Math.max(diameter, throughRoot);

        return 1 + Math.max(leftHeight,rightHeight);
    }
    public static void main(String[] args) {
        Node root = new Node(10);

        root.left = new Node(5);
        root.right = new Node(20);

        root.left.left = new Node(2);
        root.left.right = new Node(7);

        root.right.left = new Node(15);
        root.right.right = new Node(30);

        height(root);
        System.out.println(diameter);

    }

}
