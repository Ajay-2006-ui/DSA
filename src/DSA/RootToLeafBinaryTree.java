package DSA;

import java.util.ArrayList;

public class RootToLeafBinaryTree {
    static void rootleaf(Node root, ArrayList<Integer>Path) {
        if (root == null) {
            return;
        }
        Path.add(root.data);
        if (root.left == null && root.right == null) {
            System.out.print(Path + " ");
        } else {
            rootleaf(root.left, Path);
            rootleaf(root.right, Path);
        }
        Path.remove(Path.size()-1);
    }
    public static void main(String[] args) {
        Node root = new Node(10);

        root.left = new Node(5);
        root.right = new Node(20);

        root.left.left = new Node(2);
        root.left.right = new Node(7);

        root.right.left = new Node(15);
        root.right.right = new Node(30);
        rootleaf(root,new ArrayList<Integer>());
    }

}
