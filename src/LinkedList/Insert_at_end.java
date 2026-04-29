package LinkedList;

public class Insert_at_end {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
        public static class linked_list {
            Node head = null;
            Node tail = null;

            void insert_at_end(int val) {
                Node temp = new Node(val);
                if (head == null) {
                    head = temp;
//                    tail = temp;
                } else {
                    tail.next = temp;
//                   tail=temp
                }
                tail=temp;
            }

            void display(){
                Node temp=head;
                while(temp!=null){
                    System.out.print(temp.data+" ");
                    temp=temp.next;
                }
            }
          int length(Node head){
                int length=0;
                Node temp=head;
                while(temp!=null){
                    temp= temp.next;
                    length++;
                }
                return length;
            }
        }
    public static void main(String[] args) {
        linked_list l1=new  linked_list();//empty
        l1.insert_at_end(4);
        l1.insert_at_end(1);
        l1.insert_at_end(3);
        l1.display();
        System.out.println("length of linked list "+l1.length(l1.head));
      }
}
