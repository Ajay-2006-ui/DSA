package DSA;

public class BSTInsertion {
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
        insert(null,10);
    }
}
