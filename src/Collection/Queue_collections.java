package Collection;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_collections {
    //linked list as a queue
    static void linkedlistqueue(){
        Queue<String> queue=new LinkedList<>();
                // Enqueue
                queue.add("A");
                queue.offer("B");

                queue.offer("C");
                System.out.println("Queue: " + queue); // [A, B, C]

                // Peek
                System.out.println("Front: " + queue.peek()); // A

                // Dequeue
                System.out.println("Removed: " + queue.poll()); // A

                System.out.println("Queue after poll: " + queue); // [B, C]

                // Check front again
                System.out.println("Front now: " + queue.peek()); // B
            }
            static void dequeue(){
                        Queue<Integer> q = new ArrayDeque<>();

                        q.offer(10);
                        q.offer(20);
                        q.offer(30);

                        System.out.println("Queue: " + q);         // [10, 20, 30]
                        System.out.println("Head: " + q.peek());   // 10

                        q.poll(); // removes 10
                        System.out.println("After poll: " + q);    // [20, 30]
                    }
    static void priorityqueue(){
        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);

        System.out.println(pq);         // [10, 30, 20] (Internally min-heap)
        System.out.println(pq.poll());  // 10

    }
    public static void main(String[] args) {
linkedlistqueue();
dequeue();
priorityqueue();
    }
}
