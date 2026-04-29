package LinkedList;

import java.util.Scanner;

public class INSERTION_At_end2_Traversal {
   public static class Node { //Static class → class level par hoti hai
     //  main() use directly access kar sakta hai
        int data;
        Node next;

       Node(int data) {
            this.data = data;
        }
   }
    public  static void display(Node head) { //👉 Tumne int data pass kiya
        // ❌ Lekin Linked List ka traversal node se hota hai, integer se nahi
        Node temp = head;//❓ Q2: Why not use head directly?
//👉 Head lost ho sakta hai ❌
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;  //❓ Q1: What happens if temp = temp.next is removed?
//👉 Infinite loop ❌
        }
    }
    public static Node insert_At_End (Node head){
       Scanner sc=new Scanner(System.in);
       Node newNode=new Node(sc.nextInt());
       Node temp=head;
        // Case 1: Empty list   🔹 Why not print Node directly?
        //👉 Java object print → ClassName@hashcode
        //❓ Q2: What if while condition is temp != null?
        //❌ NullPointerException
        if (head == null) {
            return newNode;
        }
        while(temp.next!=null){
          temp=  temp.next;
        }
        temp.next=newNode;
        return head;
    }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter value head: ");
            Node head=new Node(sc.nextInt());
            display(head);
            head=insert_At_End(head);
            display(head);
        }
    }
