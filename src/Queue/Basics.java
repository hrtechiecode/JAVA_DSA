package Queue;

import java.util.*;

public class Basics {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println("stack "+st);
        System.out.println("stack pop "+st.pop());
        System.out.println("after remove an element "+st);
        //Queue<Integer>que=new Queue<>(); //not applicable
       // Queue <Integer>q=new ArrayDeque<>(); applicable
        Queue <Integer>q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        System.out.println("queue "+q);
        System.out.println("size "+q.size());
        System.out.println("remove element from queue "+q.remove());
        System.out.println("queue after removing element "+q);
        q.poll(); //same as remove
        System.out.println(q);
        System.out.println("top "+q.peek());
        System.out.println(q.element());
        System.out.println(q.isEmpty());
    //print queue
        Queue <Integer>q2=new LinkedList<>();
        q2.add(1);
        q2.add(2);
        q2.add(3);
        q2.add(4);
        q2.add(5);
        q2.add(6);
        Queue <Integer>h=new LinkedList<>();
        while(q2.size()>0) {
            System.out.print(q2.peek()+" ");
            h.add(q2.poll());
        }
        while(h.size()>0){
            q2.add(h.poll());
        }
    }
}
