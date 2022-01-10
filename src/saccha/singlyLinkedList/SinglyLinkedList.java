package saccha.singlyLinkedList;


public class SinglyLinkedList {
    Node head;
    Node tail;
    int size = 0;

    public boolean isEmpty() {
        return size == 0;
    }

    public void addData(int data) {
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
            addData(data);
        } else {
            Node temp = head;
            Node newNode = new Node(data, null);
            head = newNode;
            head.next = temp;
        }
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

            addData(data);
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

    public int removeAt(int index) {
        if (index > size) {
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
        list.addData(10);
        list.addData(20);
        list.addData(30);
        list.addData(40);
        list.addData(50);
        list.printList();
        int index = 3;
        System.out.println("after removed data from "+index+" index");
        list.removeAt(index);
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
