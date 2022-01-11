package monirameem.linkedList;

public class SinglyLinkedList {

    int size = 0;
    Node head;
    Node tail;

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    public void addFirst(int data) {

        if (isEmpty()){
            add(data);
        } else {
            head = new Node(data, head);
            size++;
        }
    }

    public void add(int data){

        Node newNode = new Node(data, null);

        if (isEmpty()){
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    public void addAt(int index, int data) {

        if (index < 0 || index > size){
            System.out.println("Invalid insertion position");
            return;
        }

        if (index == size){
            add(data);
        } else if(index == 0) {
            addFirst(data);
        } else {

            Node temp = head;
            int i = 1;

            while (i < index){
                temp = temp.next;
                i++;
            }
            temp.next = new Node(data, temp.next);
            size++;
        }
    }

    public void reverseList() {
        Node current = head;
        Node prev = null;
        Node next = null;

        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        tail = head;
        head = prev;
    }

    public int removeFirst() {
        if (isEmpty()){
            System.out.println("This List is Empty");
            return 0;
        }
        int data = head.data;
        head = head.next;
        size--;
        if (isEmpty())
            tail = null;
        return data;
    }

    public int remove() {
        Node temp = head;

        while (temp.next.next != null){
            temp = temp.next;
        }
        int data = temp.next.data;
        temp.next = null;
//        tail = temp;
        size--;
        return data;
    }

    public int removeAt(int index) {

        if (isEmpty()){
            System.out.println("Invalid position");
            return 0;
        }

        if (index == 0){
           return removeFirst();
        } else if (index == size){
           return remove();
        }
        int i = 1;
        Node temp = head;

        while (i < index){
            temp = temp.next;
            i++;
        }
        int data = temp.next.data;
        temp.next = temp.next.next;
        size--;

        return data;

    }

    public void printList() {
        if (isEmpty())
            System.out.println("List is Empty");
        else {
            Node temp = head;

            while (temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }


    static class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

}
