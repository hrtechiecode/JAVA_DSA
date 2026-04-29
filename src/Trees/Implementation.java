package Trees;

public class Implementation {
    public static class Node {
        int val; // 0
        Node left;//null
        Node rt;//null

        public Node(int val) {
            this.val = val;
        }
    }
        public static void display(Node root){
        if(root==null)return;
            System.out.print(root.val+" -> ");
            if(root.left!=null)System.out.print(root.left.val+",");
            if(root.rt!=null)  System.out.print(root.rt.val);
            System.out.println();
            display(root.left);
            display(root.rt);
        }

        public static void main(String[] args) {
            Node root = new Node(2);
            Node a = new Node(4);
            Node b= new Node(10);
            root.left=a;
            root.rt=b;
            Node c= new Node(6);
            Node d= new Node(5);
            a.left=c;
            a.rt=d;
            Node e= new Node(11);
            b.rt=e;
            b.rt=e;
display(root);


//root.val=20;
//        System.out.println(root.val);

        }
    }