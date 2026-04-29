package LinkedList;

import java.util.Scanner;

public class Length_Insertion_at_end_beg_idx {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    public static void displayrecursion(Node head) {
        if (head == null) return;   // base case  ✔ Prevents infinite recursion — very important concept.
        System.out.print(head.val + " ");
        displayrecursion(head.next);
    }
    public static int length(Node head){
int length=0;
Node temp=head;
while(temp!=null){
   temp= temp.next;
   length++;
}
return length;
    }
    public static class Linked_List {
        Node head= null;
        Node tail=null;
     void insert_at_end(int val) {   //🔸 Insert at End
//
//         Without tail → O(n)
//
//         With tail → O(1) ⭐
            Node newNode = new Node(val);
            if (head == null) {
            head=newNode;
               tail=newNode;
            } else {
           tail.next=newNode;
           tail=newNode;
            }

        }
        void insert_at_beg(int val){
            Node newNode = new Node(val);
            if (head == null) {
                head=newNode;
                tail=newNode;
            } else {
                newNode.next=head;
                head=newNode;
            }

        }
        void insert_at_idx(int idx,int val){
            Node newNode = new Node(val);
        Node temp=head;
                for (int i = 1; i < idx; i++) {
                    temp = temp.next;
                }
                newNode.next=temp.next;
                temp.next=newNode;

        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value head: ");
        Node head=new Node(sc.nextInt());
        Node a=new Node(50);
        Node b=new Node(60);
        Node c=new Node(70);
        Node d=new Node(80);
        head.next=a;
        a.next=b;
        b.next=c;
        c.next=d;
        System.out.println("print linked list from head");
        display(head);
//        display(a);
//        display(b);
//        display(c);
//        display(d);
        System.out.println();
        System.out.println("print linked list using recursion from a");
        displayrecursion(a);
        System.out.println();
        System.out.println("length of linked list");
        System.out.println(length(head));
        Linked_List l=new Linked_List();
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value: ");
            l.insert_at_end(sc.nextInt());
        }

        System.out.println("Linked List:");
        display(l.head);

        System.out.println("\nLength of Linked List:");
        System.out.println(length(l.head));

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value: ");
            l.insert_at_beg(sc.nextInt());
        }
        System.out.println("linked list element insert from begining");
        display(l.head);
        System.out.println();
        System.out.println("enter an idx in which you like to enter new element");
        l.insert_at_idx( sc.nextInt(), 100);
        System.out.println("after insertion");
        display(l.head);
    }
}
/*important baatein
✅ FIX
👉 Jab linked_list class bana li hai, manual Node creation hata do
❌ MISTAKE 2: length() outside LinkedList class
🔴 Problem
public static int length(Node head)


👉 Har baar head pass karna pad raha hai
👉 LinkedList apna size khud manage nahi kar rahi
❌ MISTAKE 3: display() bhi outside hai
🔴 Problem
display(l.head);


👉 User ko head expose karna pad raha hai
👉 Encapsulation break ho rahi hai
❌ MISTAKE 5: Naming Convention
🔴 Problem
class linked_list


👉 Java convention follow nahi ho rahi

✅ FIX
class LinkedList


📌 Interviewers NOTICE THIS 👀
🧠 Pehle static samjho (Simple Language)
🔹 static ka matlab

Ye cheez class ki hoti hai, object ki nahi

Example:

static int x;


👉 x sab objects ke liye same hota hai

❌ Agar LinkedList ke methods static kar do
static void insertAtEnd(int val) {
    head = new Node(val);  // ❌ ERROR
}


👉 ERROR kyun?

head object ka variable hai

static method ko object variables directly access karne ki permission nahi hoti
 */