package programming;
import programming.Node;
public class InordertraversalArray {
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.data +" ");
        inorder(root.right);

    }
    public static void main(String[] args) {

        Node[] nodes = new Node[10];

        for(int i = 1; i <= 9; i++){
            nodes[i] = new Node(i);
        }

        nodes[1].left = nodes[2];
        nodes[1].right = nodes[3];

        nodes[2].left = nodes[4];
        nodes[2].right = nodes[5];

        nodes[3].left = nodes[6];
        nodes[3].right = nodes[7];

        nodes[4].left = nodes[8];
        nodes[4].right = nodes[9];

        inorder(nodes[1]);
    }
}


