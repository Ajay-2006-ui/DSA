package DSA;


public class BSTInorderSucessor {
    static Node  findMin(Node root) {

        while (root.left != null) {
            root = root.left;
        }

        return root;
    }
    static Node inordersucessor(Node root,int key){
         Node succ = null;
         while(root!=null){
             if(key<root.data){
                 succ=root;
                 root=root.left;
             }
             else if(key>root.data){
                 root=root.right;
             }
             else{
                 if(root.right!=null){
                     succ= findMin(root.right);
                 }
                 break;
             }

         }
         return succ;
    }
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

    public static void main(String[]args){
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
       Node Suc= inordersucessor(root,15);
       System.out.println(Suc.data);


    }
}
