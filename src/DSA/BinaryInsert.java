package DSA;
import java.util.*;

public class BinaryInsert{

        static Node insert(Node root, int value) {

            Node newNode = new Node(value);

            if (root == null)
                return newNode;

            Queue<Node> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {

                Node current = queue.poll();

                if (current.left == null) {
                    current.left = newNode;
                    return root;
                } else {
                    queue.add(current.left);
                }

                if (current.right == null) {
                    current.right = newNode;
                    return root;
                } else {
                    queue.add(current.right);
                }
            }

            return root;
        }

        public static void main(String[] args) {

            Node root = new Node(10);
            root.left = new Node(5);
            root.right = new Node(20);
            root.left.left = new Node(2);

            root = insert(root, 15);
        }
    }
