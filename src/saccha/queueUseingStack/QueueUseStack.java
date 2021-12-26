package saccha.queueUseingStack;

import java.util.EmptyStackException;

public class QueueUseStack {
    private int[] stack;
    int top =-1;
    int size=0;
    public QueueUseStack(){
        stack = new int[10];
    }
    public QueueUseStack(int size){
        stack = new int[size];
    }
    public void push(int data){
        top++;
        size++;
        stack[top]=data;
    }
    public int pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }else {
            int[] temp = new int[size];
            int index =0;
            for (int i = size - 1; i >= 0; i--) {
                temp[index] = stack[i];
            }
            int data = temp[top];
            top--;
            size--;
            return data;
        }
    }
    public void print(){  //not a parfect implementation
        int[] temp = new int[size];
        int index =0;
        for (int i = size - 1; i >= 0; i--) {
            temp[index] = stack[i];index++;
        }
        for (int i =top;i<size;i++){
            System.out.print(i+",");
        }
        System.out.println();
    }
    public int getSize(){
        return size;
    }
    public boolean isFull(){
        return top == stack.length-1;
    }
    public boolean isEmpty() {
        return top ==-1;
    }

    public static void main(String[] args) {
        QueueUseStack queueUseStack = new QueueUseStack();
        queueUseStack.push(1);
        queueUseStack.push(2);
        queueUseStack.push(3);
        queueUseStack.push(4);
        queueUseStack.push(5);
        queueUseStack.push(6);
        queueUseStack.pop();
        queueUseStack.pop();
        queueUseStack.pop();
        queueUseStack.pop();
        queueUseStack.print();
        System.out.println(queueUseStack.getSize());
    }
}
