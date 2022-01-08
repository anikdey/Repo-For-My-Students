package queue.linkedList;

import org.w3c.dom.Node;

public class LinkedListBasedQueue {

    private Node head;
    private Node tail;
    private int size = 0;

    public static class Node{

        int data;
        Node address;

        public Node(int data,Node address){
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
        int temp = 0;

        if(isEmpty()){
            System.out.println("List is empty");
        }
        else {
            temp = head.data;
            head = head.address;
            size--;
        }
        return temp;
    }
    public int firstNode(){

        int temp = head.data;
        return temp;
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
        LinkedListBasedQueue l = new LinkedListBasedQueue();

        l.enqueue(23);
        l.enqueue(24);
        l.enqueue(25);
        l.enqueue(26);
        l.enqueue(27);
        l.printQueue();
        System.out.println("First Node : " + l.firstNode());
        System.out.println("List size : " + l.getSize());
        l.dequeue();
        l.dequeue();
        l.printQueue();
        System.out.println("First Node : " + l.firstNode());

    }

}
