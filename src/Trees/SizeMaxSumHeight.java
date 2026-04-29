package Trees;

public class SizeMaxSumHeight {
    public static class Node {
        int val; // 0
        Node left;//null
        Node rt;//null

        public Node(int val) {
            this.val = val;
        }
    }
        public static void preorderTraverse(Node root){
            if(root==null)return;
            System.out.print(root.val+" ");
            preorderTraverse(root.left);
            preorderTraverse(root.rt);
        }
    public static void inorder(Node root){
        if(root==null)return;
      inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.rt);
    }
    public static void postorder(Node root){
        if(root==null)return;
       postorder(root.left);
        postorder(root.rt);
        System.out.print(root.val+" ");

    }

public  static int size(Node root){
        if(root==null)return 0;
        return 1+size(root.left)+size(root.rt);
}
    public  static int sum(Node root){
        if(root==null)return 0;
        return root.val+sum(root.left)+sum(root.rt);
    }
    public  static int max(Node root){
        if(root==null)return Integer.MIN_VALUE;
int a= root.val;
int b=max(root.left);
int c=max(root.rt);

        return Math.max(a,Math.max(b,c));
    }
    public  static int height(Node root){
        if(root==null)return 0;
        if(root.left==null&&root.rt==null)return 0;
        return 1+Math.max(height(root.left),height(root.rt));
    }
    public static void nthlevel(Node root,int n){
        if(root==null)return ;
        if(n==1)System.out.print(root.val+" ");
        nthlevel(root.left,n-1);
        nthlevel(root.rt,n-1);

    }

        public static void main(String[] args) {
            Node root = new Node(1);
            Node a = new Node(2);
            Node b= new Node(3);
            root.left=a;
            root.rt=b;
            Node c= new Node(4);
            Node d= new Node(5);
            a.left=c;
            a.rt=d;
            Node e= new Node(6);
            b.rt=e;
            preorderTraverse(root);
            System.out.println("size of tree "+ size(root));
            System.out.println("sum of tree "+ sum(root));
            System.out.println("max of tree "+ max(root));
            System.out.println("height of tree "+height(root));
            System.out.println("preorder");
            preorderTraverse(root);
            System.out.println("inorder");
            inorder(root);
            System.out.println("postorder");
            postorder(root);
            System.out.println("print nth level");
//            nthlevel(root,1);
//            System.out.println();
//            nthlevel(root,2);
//            System.out.println();
//            nthlevel(root,3);
            int level=height(root)+1;
            for(int i=1;i<=level;i++){
                nthlevel(root,i);
                System.out.println();
            }
}
        }

