package monirameem.queue;

public class LinkedListBasedQueue<T> {

    private int size = 0;
    private Node<T> front;
    private Node<T> rear;

    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public void enQueue(T data) {
        Node<T> node = new Node<>(data,null);

        if (front == null){
            front = node;
        } else {
            rear.next = node;
        }
        rear = node;
        size++;
    }

    public T deQueue(){
        Node<T> temp = front;
        if (temp == null)
            return null;
        front = front.next;
        size--;
        return temp.data;
    }

    public void print() {
        Node<T> temp = front;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static class Node<T> {

        private T data;
        private Node<T> next;

        Node(T data, Node<T> next){
            this.data = data;
            this.next = next;
        }

        public Node<T> getNext() {
            return next;
        }

        public T getData() {
            return data;
        }
    }

    public static void main(String[] args) {

        LinkedListBasedQueue<Integer> queue = new LinkedListBasedQueue<>();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.print();

        System.out.println(queue.deQueue());
        queue.print();
        queue.enQueue(5);
        queue.print();

    }
}
