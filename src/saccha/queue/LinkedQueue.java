package saccha.queue;

public class LinkedQueue  {

   private Node head;
   private Node tail;
   private int size = 0;



    public void enQueue(int data) {
        Node newNode = new Node(data,null);

        if (head==null){
            head = newNode;
        }else{
            tail.next = newNode;
        }
        tail = newNode;
    }


    public int deQueue() {
        int output = head.data;
        head = head.next;
        size--;
        System.out.println();
        return output;
    }


    public int first() {
        System.out.println();
        return head.data;
    }


    public void printQueue() {
        Node temp = head;

        while (temp!=null){
            System.out.print(temp.data+"  ");
            temp=temp.next;
        }
    }

    private class Node{
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
