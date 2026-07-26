package DSA;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryBFSLevelOrderTraversal {
    static void LevelOrder(Node root) {
        if (root == null)
            return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");
            if (current.left != null)
                queue.add(current.left);
            if (current.right != null)
                queue.add(current.right);
        }

    }
    public static void main(String[] args) {
        BinaryBFSLevelOrderTraversal obj = new BinaryBFSLevelOrderTraversal();
        Node root = new Node(10);

        root.left = new Node(5);
        root.right = new Node(20);

        root.left.left = new Node(2);
        root.left.right = new Node(7);

        root.right.left = new Node(15);
        root.right.right = new Node(30);
        obj.LevelOrder(root);
    }

}
