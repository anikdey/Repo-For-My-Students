package saccha.singlyLinkedList;

//        Implement Single Linked List. Try with methods ->
//
//        Node getHead(), Node getNodeAt(int index), int getSize(), int getSizeRecursive(Node temp),
//        int getSizeIterative(Node temp), boolean isEmpty(),
//        void add(T data), void addFirst(T data), void addLast(T data), void insertAt(int position, T data),
//        Node deleteAt(int position), T first(), T last(), T removeFirst(),
//        T removeLast(), T getFromTail(int position) (iterative & recursive), T getItemAt(int index),
//        void reverse() (iterative & recursive), disconnectNode(Node<T> node)

public class SinglyLinkedList {
    Node head;
    Node tail;
    int size = 0;

    public boolean isEmpty() {
        return size == 0;
    }

    public Node getHead(){
        return head;
    }
    public Node getTail(){
        return tail;
    }
    public Node getNodeAt(int index){
        if (index==0){
           return getHead();
        }else {
            Node temp = head;
            int i = 0;
            while (i <index){
                temp =temp.next;
            }
            return temp;
        }
    }
    public int getSize(){
        return size;
    }

    public int getSizeIterative(Node temp){

        int count = 0;
        while (temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }

    public void add(int data) {
        Node newNode = new Node(data, null);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    public void addFirst(int data) {
        if (isEmpty()) {
            add(data);
        } else {
            Node temp = head;
            Node newNode = new Node(data, null);
            head = newNode;
            head.next = temp;
        }
    }
    public void addLast(int data){
        Node newNode = new Node(data,null);
        tail.next = newNode;
        tail = newNode;
    }
    public int first(){
        return head.data;
    }
    public int last(){
        return tail.data;
    }

    public void reverse() {
        Node prev = null;
        Node next = null;
        Node temp = head;
        while (temp != null) {
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        head = prev;
    }

    public void insertAt(int index, int data) {
        if (index > size) {
            System.out.println("wrong index");
            return;
        } else if (index == 0) {

            add(data);
        } else {

            int i = 0;
            Node temp = head;

            while (i < index) {
                temp = temp.next;
                i++;
            }

            Node node = new Node(data, temp.next);
            temp.next = node;
            size++;

        }

    }

    public int deleteAt(int index) {
        if (index >= size) {
            System.out.println("no node exist in this index");
            return Integer.MIN_VALUE;
        } else {
            int i = 0;
            Node temp = head;

            while (i < index - 1) {
                temp = temp.next;
                i++;
            }

            int data = temp.next.data;
            temp.next = temp.next.next;
            size--;
            return data;
        }
    }

    public int removeFirst(){
        int data = head.data;
        head = head.next;
        return data;
    }
    public int removeLast(){
        Node temp = head;
        int data =0;
        while (temp.next!=tail){
            temp = temp.next;
        }
        data = tail.data;
        tail = temp;
        tail.next = null;
        return data;
    }

    public Node getFromTail(int position){
        if (position==0 || position>size){
            System.out.println("no data exist on this position");
        }
        else{
            Node temp = head;
            int i = 1;
            while (i <= position) {
                temp = temp.next;
                i++;
            }
            return temp;
        }
        return tail;
    }
    public int getItemAt(int position){
            if (position==0 || position>size){
                System.out.println("no data exist on this position");
            }
            else{
                Node temp = head;
                int i = 1;
                while (i <= position) {
                    temp = temp.next;
                    i++;
                }
                return temp.data;
            }
            return tail.data;
    }
    public void printList(){
        Node temp = head;

        while (temp!=null){
            System.out.print(temp.data+",");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("=========");
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.printList();
        int index = 3;
        System.out.println("after removed data from "+index+" index");
        list.deleteAt(index);
        list.printList();
        System.out.println("after reversed list");
        list.reverse();
        list.printList();
    }

    public class Node {
        Node next;
        int data;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

}
