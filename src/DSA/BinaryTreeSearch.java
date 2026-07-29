package DSA;

public class BinaryTreeSearch {
    static Boolean Search(Node root, int value) {
        if (root == null)
            return false;
        if (root.data == value)
            return true;
        if(value < root.data){
            return Search(root.left,value);
        }
        return Search(root.right,value);
    }
    public static void main(String[] args) {
        Node root = new Node(10);

        root.left = new Node(5);
        root.right = new Node(20);

        root.left.left = new Node(2);
        root.left.right = new Node(7);

        root.right.left = new Node(15);
        root.right.right = new Node(30);

        System.out.println(Search(root,20));
    }

}