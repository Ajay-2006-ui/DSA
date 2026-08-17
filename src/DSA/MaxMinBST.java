package DSA;

public class MaxMinBST {
    static Node insert(Node root, int value) {

        // If position is empty, create new node
        if (root == null)
            return new Node(value);

        // Smaller value → left
        if (value < root.data) {
            root.left = insert(root.left, value);
        }

        // Larger value → right
        else if (value > root.data) {
            root.right = insert(root.right, value);
        }

        return root;
    }
    static  Node Maxvalue(Node root){
        if(root==null){
            return null;
        }
        while(root.right!=null){
            root=root.right;
        }
        return root;
    }
    static  Node Minvalue(Node root){
        if(root==null){
            return null;
        }
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
     public static void main(String[] args) {
         Node root =null;

         // INSERT VALUES
         root = insert(root, 10);
         root = insert(root, 5);
         root = insert(root, 20);
         root = insert(root, 2);
         root = insert(root, 7);
         root = insert(root, 15);
         root = insert(root, 30);
         root = insert(root, 25);
         Node max = Maxvalue(root);
         System.out.println(max.data);
         Node min = Minvalue(root);
         System.out.println(min.data);

     }

}
