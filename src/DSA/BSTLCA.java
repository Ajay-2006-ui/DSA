package DSA;

public class BSTLCA {
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
    static Node LCA(Node root, int p, int q) {

        if (root == null)
            return null;

        if (p < root.data && q < root.data) {
            return LCA(root.left, p, q);
        }

        if (p > root.data && q > root.data) {
            return LCA(root.right, p, q);
        }

        return root;
    }
    public static void main(String[] args) {
        Node root = null;
        root = insert(root, 10);
        root = insert(root, 5);
        root = insert(root, 20);
        root = insert(root, 2);
        root = insert(root, 7);
        root = insert(root, 15);
        root = insert(root, 30);
        root = insert(root, 25);
       Node answer= LCA(root, 10, 15);
       System.out.println(answer.data);
    }
}
