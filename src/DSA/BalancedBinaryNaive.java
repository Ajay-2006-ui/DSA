package DSA;

public class BalancedBinaryNaive {
    static boolean isBalanced(Node root){

        if(root == null)
            return true;

        int leftHeight = TreeHeight.height(root.left);
        int rightHeight = TreeHeight.height(root.right);

        if(Math.abs(leftHeight - rightHeight) > 1)
            return false;

        return isBalanced(root.left) && isBalanced(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(10);

        root.left = new Node(5);
        root.right = new Node(20);

        root.left.left = new Node(2);
        root.left.right = new Node(7);

        root.right.left = new Node(15);
        root.right.right = new Node(30);

        System.out.println(isBalanced(root));
    }
}
