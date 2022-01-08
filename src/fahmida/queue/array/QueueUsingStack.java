package queue.array;

public class QueueUsingStack {

    int[] stack1 = null;
    int[] stack2 = null;

    private int top = -1;
    private int size = 0;

    public  QueueUsingStack(int size){
        stack1 = new int[size];
        stack2 = new int[size];
    }

    public boolean isEmpty(){
        return size == 0;
    }
    public boolean isFull(){
        return size == stack1.length;
    }
    public int getSize(){
        return size;
    }
    public void enqueue(int data){
        if (isFull()){
            System.out.println("Queue is full");
        }
        else{
            top++;
            stack1[top] = data;
            size++;
        }
    }
    public int dequeue(){
        int data = 0;

        if(isEmpty()){
            return Integer.MIN_VALUE;
        }
        else{
             int temp =size;
             int j =0;

             for(int i = temp - 1; i >= 0; i--, j++){
                 stack2[j] = stack1[i];
             }
             data = stack2[j -1];

             int k = 0;
             for (int i = j-2; i >= 0; i--){
                 stack1[k] = stack2[i];
                 k++;
             }
             size--;
             top--;
        }
        return data;
    }

    public void printQueue(){

        for (int i = 0; i <= top; i++){
            System.out.print(stack1[i] + " ");
        }
        System.out.println();
    }

    public static void myCode(){

        QueueUsingStack qs =new QueueUsingStack(5);

        qs.enqueue(12);
        qs.enqueue(13);
        qs.enqueue(14);
        qs.enqueue(15);
        qs.enqueue(16);
        qs.printQueue();
        System.out.println(qs.getSize());

        qs.dequeue();
        qs.dequeue();
        qs.printQueue();
    }

    public static void main(String[] args) {

        myCode();
    }
 }
