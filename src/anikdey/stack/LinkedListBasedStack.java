package anikdey.stack;

import java.util.EmptyStackException;

public class LinkedListBasedStack {

    private int size = 0;
    private Node head;

    public void push(int data) {
        head = new Node(data, head);
        size++;
    }

    public int pop() {
        if(isEmpty())
            throw new EmptyStackException();
        int data = head.data;
        head = head.next;
        size--;
        return data;
    }

    public int getTop() {
        if(isEmpty())
            throw new EmptyStackException();
        return head.data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void printStack() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+", ");
            temp = temp.next;
        }
        System.out.println();
    }

    private class Node {
        int data;
        Node next;
        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[] args) {

        LinkedListBasedStack stack = new LinkedListBasedStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.getSize());
        System.out.println("Top element "+stack.getTop());
        System.out.println("Popped element "+stack.pop());
        System.out.println(stack.getSize());
        stack.printStack();

    }

}
