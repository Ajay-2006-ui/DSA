package DSA;

public class KthSmallestBST {
    static int count=0;
    static int answer =-1;
    static void kthsmallest(Node root,int k){
        if(root==null){
            return;
        }
        kthsmallest(root.left,k);
        count++;
        if(count==k){
            answer =root.data;
            return;
        }
        kthsmallest(root.right,k);
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
        Node root = null;
        root = insert(root, 10);
        root = insert(root, 5);
        root = insert(root, 20);
        root = insert(root, 2);
        root = insert(root, 7);
        root = insert(root, 15);
        root = insert(root, 30);
        root = insert(root, 25);
        kthsmallest(root,5);
        System.out.println(answer );

    }
}
