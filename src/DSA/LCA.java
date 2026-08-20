package DSA;

public class    LCA {
    static Node LowestCommonAncestor(Node root,int p,int q){
        if(root==null){
            return  null;
        }
        if(root.data==p || root.data==q){
            return root;
        }
        Node left=LowestCommonAncestor(root.left,p,q);
        Node right=LowestCommonAncestor(root.right,p,q);
        if(left!=null&&right!=null){
            return root;
        }
        if(left!=null)
            return left;
        return  right;
    }
    public static void main(String[] args) {
        Node root = new Node(10);

        root.left = new Node(5);
        root.right = new Node(20);

        root.left.left = new Node(2);
        root.left.right = new Node(7);

        root.right.left = new Node(15);
        root.right.right = new Node(30);

        Node ans =LowestCommonAncestor(root,2,7);
        System.out.println(ans.data);

    }
}
