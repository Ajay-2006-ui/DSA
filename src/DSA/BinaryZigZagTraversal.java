package DSA;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryZigZagTraversal {
    static void Zigzag(Node root) {
        if (root == null)
            return;

        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        boolean lefttoRight = true;
        while (!q.isEmpty()) {
            int size = q.size();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node cur = q.poll();
                list.add(cur.data);
                if (cur.left != null)
                    q.add(cur.left);
                if (cur.right != null)
                    q.add(cur.right);
            }
            if (lefttoRight) {
                for(int x : list) {
                    System.out.print(x + " ");
                }

                }
            else{
                for(int i=list.size()-1;i>=0;i--){
                    System.out.print(list.get(i) + " ");
                }
            }
            lefttoRight = !lefttoRight;


        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);

        root.left = new Node(5);
        root.right = new Node(20);

        root.left.left = new Node(2);
        root.left.right = new Node(7);

        root.right.left = new Node(15);
        root.right.right = new Node(30);

        Zigzag(root);
    }
}
