package LinkedList;

import java.util.Scanner;

public class Search_an_element {
    public static class Node{
        int data;
        Node next;
        Node(int data) {

            this.data = data;
        }
    }
    public static void traverse(Node head){
       Node temp= head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    //search
    public static boolean search(Node head,int element){
        Node temp= head;
        while(temp!=null){
            temp=temp.next;
            if(element==temp.data){
               return true;
            }

        }
       return false;
    }
    public static void main(String[] args) {

     Node a=new Node(1);
        a.next=new Node(2);
        a.next.next=new Node(3);
        a.next.next.next=new Node(4);
        a.next.next.next.next=new Node(5);
        traverse(a);
        System.out.println("enter element to search");
        Scanner sc=new Scanner(System.in);
        int element=sc.nextInt();
        if (search(a, element))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
