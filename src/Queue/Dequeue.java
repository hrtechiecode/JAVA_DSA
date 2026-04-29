package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class Dequeue {
    public static void main(String[] args) {
        Deque<Integer> d=new LinkedList();
d.add(10);//by default last
d.addLast(20);
d.addFirst(30);
d.add(50);
        System.out.println(d);
        d.remove();
        d.removeFirst();
        d.removeFirstOccurrence(1);
        System.out.println(d);
    }
}
