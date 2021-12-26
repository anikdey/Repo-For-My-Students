package monirameem.stack;

public class ArrayBasedStack {

    int top = -1;
    int[] stack;

    public ArrayBasedStack(){
        stack = new int[5];
    }

    public ArrayBasedStack(int size){
        stack = new int[size];
    }

    public boolean isFull(){
        return top == stack.length-1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public int peak(){
        if (isEmpty())
            return -1;
        return stack[top];
    }

    public int size(){
        return top+1;
    }

    public void push(int data){
        if (isFull()){
            int[] prev = stack;
            stack = new int[prev.length*2];
            //Arrays.copyOf(prev,prev.length);
            if (prev.length >= 0) System.arraycopy(prev, 0, stack, 0, prev.length);
//            for (int i = 0; i <prev.length; i++){
//                stack[i] = prev[i];
//            }
            stack[++top] = data;

        } else {
            stack[++top] = data;
        }
    }

    public int pop(){
        if (isEmpty())
            return -1;

        int data = stack[top];
        top--;
        return data;
    }

    public void printStack(){
        if (isEmpty())
            System.out.println("stack is empty");
        else {
            for (int i = top; i > -1; i--){
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        ArrayBasedStack stack = new ArrayBasedStack(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.printStack();
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.printStack();
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.printStack();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.printStack();

    }

}
