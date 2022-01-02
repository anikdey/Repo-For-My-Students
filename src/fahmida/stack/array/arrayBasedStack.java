package stack.array;
import java.util.EmptyStackException;

public class arrayBasedStack {

    static int n = 4;
    private int top = -1;
    private int[] stack;

    public arrayBasedStack(int size){
        stack = new int[size];
    }

    public arrayBasedStack(){
        stack = new int[n];
    }

    public boolean isFull(){
        return top == stack.length -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public int getsize(){
        System.out.println("array length "+stack.length);
    return top + 1;
    }

    public int[] extra(int[] stack){

        int[] extraArray = new int[stack.length + n];

        for(int i = 0; i < stack.length; i++){
            extraArray[i] = stack[i];
        }
        return extraArray;
    }

    public int[] minimize(int[] stack){

        int[] minArray = new int[stack.length - n];

        for(int i = 0; i < minArray.length; i++){
            minArray[i] = stack[i];
        }
        return minArray;
    }

    public void push(int data){
        if(isFull())
           // throw new StackOverflowError("stack is full");
            stack = extra(stack);

        top++;
        stack[top] = data;
    }

    public int pop(){
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        int data = stack [top];
        top--;

        if(stack.length - top > n-1){
                stack = minimize(stack);

        }
        return data;
    }

    public int getTop(){
        if(isEmpty())
            throw new EmptyStackException();

        return stack[top];
    }

    public void printStack(){

        for (int i = top; i > -1; i--){
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        arrayBasedStack s = new arrayBasedStack();

        s.push(34);
        s.push(65);
        s.push(43);

        System.out.println("Top element is " + s.getTop());
        System.out.println("pop element is " + s.pop());
        s.printStack();
        s.push(37);
        s.push(30);
        s.push(31);
        s.pop();
        System.out.println("array size "+s.getsize());
        s.printStack();
        s.push(98);
        s.printStack();
        System.out.println("array size "+s.getsize());

    }
}

