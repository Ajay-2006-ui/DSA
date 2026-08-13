package DSA;
import java.util.*;

public class BinaryFullInsertion {
    static Node buildTree(int[] arr) {

        if (arr.length == 0)
            return null;

        Node root = new Node(arr[0]);


        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;

        while (i < arr.length) {

            Node current = queue.poll();

            // Left child
            if (i < arr.length) {
                current.left = new Node(arr[i++]);
                queue.add(current.left);
            }

            // Right child
            if (i < arr.length) {
                current.right = new Node(arr[i++]);
                queue.add(current.right);
            }
        }

        return root;
    }
    public static void main(String[] args) {
        int[] arr = {10,5,20,2,7,25,30};

        Node root = buildTree(arr);
        Binarytreepreorder.inorder(root);
    }
}
