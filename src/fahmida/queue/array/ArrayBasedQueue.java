package queue.array;

public class ArrayBasedQueue {

    int front = -1;
    int rear = -1;
    private int size = 0;

    int[] queue;

    public ArrayBasedQueue(){
        queue = new int[5];
    }
    public ArrayBasedQueue(int length){
        queue = new int[length];
    }
    public boolean isEmpty(){
        return front == -1 && rear == -1;
    }
    public boolean isFull(){
        return (rear + 1) % queue.length ==front;
    }
    public int getSize(){
       return size;
    }

    public void enqueue(int data){
        if(isEmpty()){
            front++;
            rear++;
            queue[rear] = data;
            size++;
        }
        else if(isFull()){
            System.out.println("Queue is full");
        }
        else {
            rear = (rear + 1) % queue.length;
            queue[rear] = data;
            size++;
        }
    }
    public int dequeue(){

        int data = -1;

        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else if (front == rear){
            data = queue[front];
            front = rear = -1;
            size--;
        }
        else {
            data = queue[front];
            front = (front + 1) % queue.length;
        }
        return data;
    }
    public void printQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else {
            for (int i = front; i != rear; ) {
                System.out.print(queue[i] + " ");
                i = (i + 1) % queue.length;
            }
            System.out.print(queue[rear]);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        ArrayBasedQueue q = new ArrayBasedQueue(9);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        q.printQueue();
        System.out.println(q.getSize());
        q.dequeue();
        q.dequeue();
        q.printQueue();
    }
}
