package LinkedList;

import java.util.Scanner;

class Node{  //create own datatype
    int data;
    Node next;
    Node (int data) { // 👉 Jab bhi new Node(10) likhenge, ye call hoga
        this.data =data; //👉 this.data → object ka data
//👉 data → constructor ka parameter
    }
}
public class Linked_List {
    public static void main(String[] args) {
//create object
        Scanner sc=new Scanner(System.in);
        System.out.println("enter head node ");
Node a=new Node(sc.nextInt());
Node b=new Node(20);
Node c=new Node(30);
Node d=new Node(40);
Node e=new Node(50);
a.next=b;
b.next=c;
c.next=d;
d.next=e;
System.out.println(a.data);
        System.out.println(b.data);
        System.out.println("b address "+a.next);
        System.out.println(" c address "+a.next.next);
        System.out.println(a.next.next.next.data);
        System.out.println(e.next);
        System.out.println(e.data);
        //System.out.println(e.next.data);
        //❌ NullPointerException   Q3: Why we don’t print address directly?
        //👉 Java me actual memory address hidden hota hai (security reason)

    }
}
