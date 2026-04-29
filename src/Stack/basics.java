package Stack;//LIFO

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class basics {
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        System.out.println(s.isEmpty());
        s.push(1);//insert elements
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s);
        System.out.println(s.isEmpty());//stack is empty or not
        System.out.println(s.peek());//top most element
        s.pop();//remove element
        System.out.println(s);
        s.pop();//remove element
        System.out.println(s);
        System.out.println("size is: "+s.size());
        //print first element
        while(s.size()>2){
            s.pop();
        }
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println();
//        //print third element
//        while(s.size()>3){
//            s.pop();
//        }
//        System.out.println(s.peek());
//        System.out.println(s);
        Scanner sc=new Scanner(System.in);
        Stack<Integer>st=new Stack();
        System.out.println("size of stack");
        int size= sc.nextInt();
        System.out.println("enter stack elements");
        for(int i=0;i<size;i++) {
            int el = sc.nextInt();
            st.push(el);
        }
        System.out.println(st);
        // Safe pop (underflow handled)
        while (!st.isEmpty()) {
            st.pop();
        }

        System.out.println("After popping all elements: " + st);

    }
}
