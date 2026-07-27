package DSA;

public class TreeHeight {
    static int height(Node root){
        if(root==null){
            return -1;
        }
        int left=height(root.left);
        int right=height(root.right);
        return 1+ Math.max(left,right)+1;
    }
    public static void main(String[] args) {
        Node root = new Node(10);

        root.left = new Node(5);
        root.right = new Node(20);

        root.left.left = new Node(2);
        root.left.right = new Node(7);

        root.right.left = new Node(15);
        root.right.right = new Node(30);

        System.out.println(height(root));
    }
}
