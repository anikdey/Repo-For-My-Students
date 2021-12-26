package anikdey.stack;

import java.util.EmptyStackException;

public class ArrayBasedStack {

    private int top = -1;
    private int[] stack;

    public ArrayBasedStack(int size) {
        stack = new int[size];
    }

    public void push(int data) {
        if(isFull())
            throw new StackOverflowError("Stack is full");
        top++;
        stack[top] = data;
    }

    public int pop() {
        if(isEmpty())
            throw new EmptyStackException();
        int data = stack[top];
        top--;
        return data;
    }

    public int getTop() {
        if(isEmpty())
            throw new EmptyStackException();
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stack.length-1;
    }

    public int getSize() {
        return top+1;
    }

    public void printStack() {
        for (int i=top; i>-1; i--) {
            System.out.print(stack[i]+", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayBasedStack stack = new ArrayBasedStack(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.getSize());

        System.out.println("Top element "+stack.getTop());
        System.out.println("Popped element "+stack.pop());
        System.out.println(stack.getSize());

        stack.printStack();

        //stack.push(4);
    }

}
