package DSA;

public class ValidBST {
    static boolean isBST(Node root, long min, long max) {

        if (root == null)
            return true;

        if (root.data <= min || root.data >= max)
            return false;

        return isBST(root.left, min, root.data)
                && isBST(root.right, root.data, max);
    }
    static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        if(data<root.data){
            root.left=insert(root.left,data);
        }
        else if(data>root.data){
            root.right=insert(root.right,data);
        }
        return root;
    }
    public static void main(String[] args) {
        Node root =null;

        // INSERT VALUES
        root = insert(root, 10);
        root = insert(root, 8);
        root = insert(root, 20);
        root = insert(root, 2);
        root = insert(root, 7);
        root = insert(root, 15);
        root = insert(root, 30);
        root = insert(root, 25);
        System.out.println(isBST(root,Long.MIN_VALUE,Long.MAX_VALUE));


    }
}
