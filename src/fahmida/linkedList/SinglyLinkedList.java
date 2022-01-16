package fahmida.linkedList;

public class SinglyLinkedList {

    Node head = null;
    Node tail = null;
    int size = 0;

    private class Node{
        int data;
        Node next;

        public Node(int data,Node next){
            this.data = data;
            this.next = next;
        }
    }
    public int getSize(){
        return this.size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void add(int data){
        Node newsetNode = new Node(data,null);

        if(head == null){
            head = newsetNode;
        } else {
            tail.next = newsetNode;
        }
        tail = newsetNode;
        size++;
    }

    public void addFirst(int data){
        Node newestNode = new Node(data,null);

        if (isEmpty()){
            add(data);
        } else{
            head = new Node(data,head);
            size++;
        }
    }

    public void addLast(int data){
        add(data);
    }

    public void insertAt(int position,int data){
        if (position > size){
            System.out.println("invalid insertion");
            return;
        }
        if(position == 1){
            addFirst(data);
        }
        else if(position == size){
            addLast(data);
        }
        else{
            Node temp = head;
            int i = 1;

            while (i < position){
                temp = temp.next;
                i++;
            }
            Node newestNode = new Node (data,temp.next);
            temp.next = newestNode;
            size++;
        }
    }

    public void printList(){
        Node temp = head;

        while (temp != null ){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int removeFirst(){
        if (isEmpty()){
            return Integer.MIN_VALUE;
        }
        if (size == 1){
            tail = null;
        }
        int data = head.data;
        head = head.next;
        size--;
        return data;
    }

    public int removeLast(){

        if(isEmpty()){
            return Integer.MIN_VALUE;
        }
        if (size == 1){
            removeFirst();
        }
        Node prev = null;
        Node temp = head;

        while (temp.next != null){

            prev = temp;
            temp = temp.next;
        }
        int data = temp.data;
        prev.next = null;
        tail = prev;
        size--;
        return data;
    }

    public void reverseIterative(){
        Node current = head;
        Node prev = null;
        Node t = head;

        while (current != null) {

            Node temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        head = prev;
        tail = t;
        printList();
    }
    public void reverseRecursive(Node head){
        if (head.next != null){
            reverseRecursive( head.next);
        }
        System.out.print(head.data + " ");
    }

    public static void main(String[] args) {
        SinglyLinkedList s = new SinglyLinkedList();

        s.add(23);
        s.add(29);
        s.add(34);
        s.add(45);
        s.add(27);
        s.add(56);
        s.add(87);
        s.printList();
        s.insertAt(3,65);
        System.out.println(s.getSize());
        s.reverseRecursive(s.head);
        s.addFirst(78);
    }
}
