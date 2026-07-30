package DSA;
import java.util.*;

public class BinaryDelete {
    static Node delete(Node root,int Key){
        if(root==null){
            return root;
        }
        if(root.left==null && root.right==null) {
            if (root.data == Key) {
                return null;
            } else {
                return root;
            }
        }
            Node Keynode=null;
            Node current=null;
            Queue<Node> queue=new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty()) {
                current = queue.poll();
                if (current.data == Key) {
                    Keynode = current;
                }
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
                if(Keynode!=null){
                    Keynode.data=current.data;
                    deletedeepest(root,current);

                }
                return root;

            }
            static void deletedeepest(Node root, Node dnode){
              Queue<Node> queue=new LinkedList<>();
              queue.add(root);
              while(!queue.isEmpty()){
                  Node current=queue.poll();
                  if(current.left==dnode){
                      current.left=null;
                      return;
                  }
                  if(current.right==dnode){
                      current.right=null;
                      return;
                  }
                  if(current.left!=null){
                      queue.add(current.left);
                  }
                  if(current.right!=null){
                      queue.add(current.right);
                  }

              }



        }
    static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(10);

        root.left = new Node(5);
        root.right = new Node(20);

        root.left.left = new Node(2);
        root.left.right = new Node(7);

        root.right.left = new Node(15);
        root.right.right = new Node(30);

        System.out.println(delete(root,15));
        inorder(root);
    }
    }

