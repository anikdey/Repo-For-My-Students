package fahmida.queue.linkedList;

public class QueueUsingStack {

    private Node head;
    private Node tail;
    private int size = 0;

    public static class Node{

        int data;
        Node address;

        public Node(int data, Node address){

            this.data = data;
            this.address = address;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void enqueue(int data){

        Node t = new Node(data,null);

        if (head == null){
            head = t;
        }
        else {
            tail.address = t;
        }
        tail = t;
        size++;
    }

    public int dequeue(){

        int t = 0;

        if(isEmpty()){
            System.out.println("List is empty");
        }
        else{
            Node current = head;
            Node prev = null;
            Node temp = head;

            while (current != null) {

                Node te = current.address;
                current.address = prev;
                prev = current;
                current = te;
            }
            head = prev;
            tail = temp;

            t = head.data;
            head = head.address;
            size--;

            current = head;
            prev = null;
            temp = head;

            while (current != null) {

                Node te = current.address;
                current.address = prev;
                prev = current;
                current = te;
            }
            head = prev;
            tail = temp;
        }
        return t;
    }

    public int firstNode(){

        int t = head.data;
        return t;
    }
    public void printQueue(){

         Node temp = head;

        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.address;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        QueueUsingStack qs = new QueueUsingStack();

        qs.enqueue(23);
        qs.enqueue(24);
        qs.enqueue(25);
        qs.enqueue(26);
        qs.enqueue(27);
        qs.printQueue();
        System.out.println("First Node : " + qs.firstNode());
        System.out.println("List size : " + qs.getSize());
        qs.dequeue();
        qs.dequeue();
        qs.printQueue();
        System.out.println("First Node : " + qs.firstNode());

    }
}
