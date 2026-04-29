package LinkedList;

public class Basics {
    //create datatype
    public static class Node{ //crteate datatype     //Static class → class level par hoti hai
        //  main() use directly access kar sakta hai
       int data;//Can data be other than int?
// ✔ YES — String, double, object, anything
        Node next;//next ka type Node hi hoga Kyunki node node ko hi point karta hai
     // by default  next = null;
        Node(int data){// constructor
            this.data=data;
        }
    }
    //traversing
    public static void insertatend(Node head,int val){
    Node temp = new Node(val);
    Node n=head;
    while(n.next!=null){
        n=n.next;
    }
        n.next=temp;
    }
    public static void display(Node head){
      Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    static void recursion(Node head ){
        if(head==null) return ;
            System.out.print(head.data+" ");
           recursion(head.next);
        }
    static void recursionrev(Node head ){
        if(head==null) return ;
        recursionrev(head.next);
        System.out.print(head.data+" ");
    }
static int length(Node head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
}
    public static void main(String[] args) {
//create object
        Node x = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        //connect
        x.next = a;//1->2
        a.next = b;//1->2->3
        b.next = c;
        c.next = d;
        // System.out.println(a.next);
        //System.out.println(b);
//        System.out.println(x.data);
//        System.out.println(x.next.data);//2
//        System.out.println(x.next.next.data);//3
//        System.out.println(a.next.data);//3
//        System.out.println(x.data); //print default value
//        System.out.println(x.next); //print address
 //       Node temp = x;
//        System.out.println(a.data);
//        System.out.println(temp.data);
//          for(int i=0;i<5;i++){
//        System.out.println(temp.data);
//        temp=temp.next;
//  }
//        while(temp!=null){
//            System.out.print(temp.data+" ");
//            temp=temp.next;
//        }
        display( x);
        System.out.println();
        recursion(x);
        System.out.println();
        recursionrev(x);
        System.out.println();
        int len=length(x);
        System.out.println("length of linked list "+len);
        insertatend(x,80);
        display(x);
    }
}
