package DSA;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLeftRightview {
     static void LeftView(Node root){
         if(root==null){
             return;
         }
         Queue<Node> queue = new LinkedList<Node>();
         queue.add(root);
         while(!queue.isEmpty()){
             int size=queue.size();
              for(int i=0; i<size; i++){
                  Node current=queue.poll();
                  if(i==0){
                      System.out.print(current.data+" ");
                  }
                  if(current.left!=null){
                      queue.add(current.left);
                  }
                  if(current.right!=null){
                      queue.add(current.right);
                  }
              }
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

        LeftView(root);
    }
}
