package stack.linkedList;

import java.util.EmptyStackException;

public class LinkedList {

    private StackNode head;
    private int size = 0;


    public static class StackNode {

        int data;
        StackNode address;

        public StackNode(int data, StackNode address) {
            this.data = data;
            this.address = address;
        }
    }

    public void push(int data) {

        StackNode newNode = new StackNode(data,null);

        if (head == null) {
            head = newNode;
        } else {
            StackNode temp = head;
            head = newNode;
            newNode.address = temp;
        }
        size++;
    }

    public int pop() {

        int temp = 0;

        if (head == null) {
            System.out.println("Stack is Empty.....");
        } else {
            temp = head.data;
            head = head.address;
            size--;
        }
        return temp;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public int getTop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return head.data;
    }

    public void printStack(){

        StackNode temp = head;

        while (temp != null){

            System.out.print(temp.data + " ");
            temp = temp.address;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        LinkedList t = new LinkedList();

        t.push(32);
        t.push(23);
        t.push(22);
        System.out.println( "List size : " + t.getSize());
        System.out.println(t.getTop());
        t.printStack();

        System.out.println("the pop element is " + t.pop());
        t.printStack();

    }
}
