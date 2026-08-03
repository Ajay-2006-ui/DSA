package DSA;

public class BinaryMirrorTree {
    static Node Mirror(Node root) {
        if (root==null){
            return null;
        }
        Node left=Mirror(root.left);
        Node right=Mirror(root.right);
        root.left=right;
        root.right=left;
        return root;
    }
    static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
        Node root = new Node(10);

        root.left = new Node(5);
        root.right = new Node(20);

        root.left.left = new Node(2);
        root.left.right = new Node(7);

        root.right.left = new Node(15);
        root.right.right = new Node(30);
        Mirror(root);
        postorder(root);

    }

}
