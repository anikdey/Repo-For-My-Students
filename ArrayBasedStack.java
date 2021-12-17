package saccha;

import java.util.EmptyStackException;

public class ArrayBasedStack{
    int top = -1;
    private int[] stack;

    public ArrayBasedStack(){
        stack = new int[10];
    }
    public ArrayBasedStack(int size){
        stack = new int[size];
    }

    public void push(int data) {
        if (isFull()){
            int[] temp =stack;
            stack = new int[stack.length*2];
            for (int i = 0; i < temp.length; i++) {
                stack[i]=temp[i];
            }
        }
        top++;
        stack[top]=data;
    }
    public boolean isFull(){
        return top == stack.length-1;
    }
    public boolean isEmpty() {
        return top ==-1;
    }

    public int pop() {
        if (isEmpty()){
            throw new EmptyStackException();
        }
        else if (stack.length/2 == top+1){
            int[] temp =stack;
            stack = new int[stack.length/2];
            for (int i = 0; i < stack.length; i++) {
                stack[i]=temp[i];
            }
        }else {
            int output = stack[top];
            top--;
            return output;
        }
        return 0;
    }


    public int getTop() {
        if (top ==-1){
            throw new ArrayIndexOutOfBoundsException("no data exists on stack");
        }
        return stack[top];
    }
    public void printStack(){
        for (int i = top; i > -1; i--) {
            System.out.print(stack[i]+",");
        }
        System.out.println();
    }


    public int getSize() {
        return top+1;
    }

}
