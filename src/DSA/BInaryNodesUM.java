package DSA;

public class BInaryNodesUM {
    static int NodeSum(Node root){
        if(root==null){
            return 0;
        }
        int leftsum=NodeSum(root.left);
        int rightsum=NodeSum(root.right);
        return leftsum+rightsum+root.data;
    }
    public static void main(String[] args) {
        Node root = new Node(10);

        root.left = new Node(5);
        root.right = new Node(20);

        root.left.left = new Node(2);
        root.left.right = new Node(7);

        root.right.left = new Node(15);
        root.right.right = new Node(30);
        System.out.println(NodeSum(root));

    }
}


