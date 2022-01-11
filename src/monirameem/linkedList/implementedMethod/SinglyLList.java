package monirameem.linkedList.implementedMethod;

public class SinglyLList<T> {

    int size = 0;
    Node<T> head;
    Node<T> tail;

    public int getSize() {
        return size;
    }

    public int getSizeIterative(Node<T> head) {
        Node<T> temp = head;
        int count = 0;

        if (temp == null){
            return 0;
        } else {
            while (temp != null){
                temp = temp.next;
                count++;
            }
        }
        return count;
    }

    public int getSizeRecursive(Node<T> temp) {
        return 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data,null);

        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    public void addFirst(T data) {
        add(data);
    }

    public void addLast(T data) {
        add(data);
    }

    public void addAt(int position, T data) {
        if (position > size || position < 0){
            System.out.println("Invalid position");
            return;
        }
        if (size == position){
            addLast(data);
        } else if (position == 0){
            addFirst(data);
        } else {
            Node<T> temp = head;
            int count = 1;

            while (count < position){
                temp = temp.next;
                count++;
            }
            temp.next = new Node<>(data,temp.next);
            size++;
        }
    }

    public T first() {
        return head.data;
    }

    public T last() { return tail.data;}

    public T getItemAt(int index) {

        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return null;
        }
        if (isEmpty()){
            System.out.println("List is empty");
            return null;
        } else if (index == size){
            return tail.data;
        } else if (index == 0){
            return head.data;
        }
        Node<T> temp = head;
        int i = 0;

        while (i != index) {
            temp = temp.next;
            i++;
        }
        return temp.data;
    }

    public Node<T> getHead() {
        return head;
    }
    public Node<T> getTail() {
        return tail;
    }

    public Node<T> getNodeAt(int index) {
        Node<T> temp = head;
        int i = 1;

        while (i != index) {
            temp = temp.next;
            i++;
        }
        return temp;
    }

    public void reverseIterative() {
        Node<T> current = head;
        Node<T> prev = null;
        Node<T> next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        tail = head;
        head = prev;
    }

    public void reverseRecursive(Node<T> temp) {
//        if (temp.next == null) {
//            tail = head;
//            head = temp;
//            return;
//        }
//        reverseRecursive(temp.next);
//        Node<T> prev = temp;
//        temp.next = null;

    }

    public T remove() {
        if (isEmpty()){
            System.out.println("List is empty");
            return null;
        }
        Node<T> temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }
        T data = temp.next.data;
        tail = temp;
        temp.next = null;
        size--;
        return data;
    }

    public T removeFirst() {
        if (isEmpty()){
            System.out.println("List is empty");
            return null;
        }
        T data = head.data;
        head = head.next;
        size--;
        if (head == null){
            tail = null;
        }
        return data;
    }

    public T removeLast() {
        return remove();
    }

    public T removeAt(int position) {

        if (position < 1 || position > size){
            System.out.println("Invalid position");
            return null;
        }

        if (position == 1){
            return removeFirst();
        } else if (position == size){
            return removeLast();
        } else {
            int i = 1;
            Node<T> temp = head;
            while (i < position){
                temp = temp.next;
                i++;
            }
            T data = temp.next.data;
            temp.next = temp.next.next;
            size--;
            return data;
        }
    }

    public T getFromTail(int position) {
        if (position <= 0 || position > size) {
            System.out.println("Invalid index");
            return null;
        }
        int index = size - position;

        if (position == 1) {
            return tail.data;
        } else if (position == size) {
            return head.data;
        } else {
            Node<T> temp = head;
            int i = 1;

            while (i != index) {
                temp = temp.next;
                i++;
            }
            return temp.next.data;
        }
    }

    public void disconnectNode(Node<T> node) {
        Node<T> temp = head;
//        Node<T> prev = null;

        while (temp.next.data != node.data) {
//            prev = temp;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }

    public void printList() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
        }

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }
}
