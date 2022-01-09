package anikdey.queue;

public class QueueUsingStack {

    int[] stack1 = null;
    int[] stack2 = null;

    int top = -1;
    int size = 0;

    public QueueUsingStack(int size) {
        stack1 = new int[size];
        stack2 = new int[size];
    }


    public void enqueue(int data) {
        top++;
        stack1[top] = data;
        size++;
    }

    public int dequeue() {
        if (top == -1)
            return Integer.MIN_VALUE;
        int temp = size;
        int j = 0;

        for (int i = temp - 1; i >= 0; i--, j++) {
            stack2[j] = stack1[i];
        }

        int data = stack2[j-1];

        int x=0;
        for (int i=j-2; i>=0; i--) {
            stack1[x] = stack2[i];
            x++;
        }
        size--;
        top--;

        return data;
    }


    public void printQueue() {
        for (int i=0; i<=top; i++) {
            System.out.print(stack1[i]+", ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        QueueUsingStack qs = new QueueUsingStack(10);
        qs.enqueue(5);
        qs.enqueue(4);
        qs.enqueue(3);
        qs.enqueue(2);
        qs.enqueue(1);


        System.out.println(qs.dequeue());
        qs.printQueue();

        System.out.println(qs.dequeue());
        qs.printQueue();

    }

}
