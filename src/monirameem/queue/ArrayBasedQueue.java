package monirameem.queue;

public class ArrayBasedQueue {

    int front = -1;
    int rear = -1;

    private int size = 0;

    int[] queue;

    ArrayBasedQueue(){
        queue = new int[5];
    }
    ArrayBasedQueue(int length){
        queue = new int[length];
    }

    public boolean isEmpty(){
        return front == -1 && rear == -1;
    }

    public boolean isFull(){
        return (rear+1)% queue.length == front;
    }

    public int size(){
        return size;
        /*if (isEmpty())
            return 0;
        else
            return (rear - front)+1;*/
    }

    public void enqueue(int data){

        if (isEmpty()){
            front++;
            rear++;
            queue[rear] = data;
            size++;
        } else if (isFull()){
            System.out.println("Queue is full");
        } else {
            rear = (rear +1)% queue.length;
            queue[rear] = data;
            size++;
        }
    }

    public int dequeue(){
        int data = -1;

        if (isEmpty()){
            System.out.println("Queue is empty");
        } else if (front == rear){
            data = queue[front];
            front = rear = -1;
            size--;
        } else {
            data = queue[front];
            front = (front +1) % queue.length;
            size--;
        }
        return data;
    }

    public void print(){
        if (isEmpty())
            System.out.println("Queue is empty");
        else {
            for(int i = front; i != rear; ){
                System.out.print(queue[i] + " ");
                i = (i+1) % queue.length;
            }
            System.out.print(queue[rear]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //oldCode();

        simulateBug();
    }

    private static void oldCode() {
        ArrayBasedQueue queue = new ArrayBasedQueue(7);

//        System.out.println(queue.size());
//        queue.enqueue(1);
//        System.out.println(queue.size());
//        queue.dequeue();
//        System.out.println(queue.size());
//        System.out.println(queue.isFull());

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.print();
        System.out.println(queue.size());
//        System.out.println(queue.isFull());
//        System.out.println(queue.size());
//        queue.dequeue();
//        queue.print();
//        System.out.println(queue.size());
//        queue.dequeue();
//        queue.print();
//        System.out.println(queue.size());
//        queue.dequeue();
//        queue.print();
//        System.out.println(queue.size());
//        queue.dequeue();
//        queue.print();
//        System.out.println(queue.size());
        queue.dequeue();
        queue.dequeue();
        queue.print();

//        System.out.println(queue.front);
//        System.out.println(queue.rear);
        System.out.println(queue.size());
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.print();
        System.out.println(queue.size());
        queue.dequeue();
        System.out.println(queue.size());
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.print();
        System.out.println(queue.size());
    }

    private static void simulateBug() {
        ArrayBasedQueue queue = new ArrayBasedQueue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println("Size "+ queue.size());
        queue.print();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        System.out.println("Size "+ queue.size());
        queue.print();
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        System.out.println("Size "+ queue.size());
        queue.print();
    }

}
