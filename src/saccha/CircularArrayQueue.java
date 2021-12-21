package saccha;

public class CircularArrayQueue {

    int front = -1;
    int rear = -1;
    private int[] queue;

    public CircularArrayQueue(){
        queue = new int[10];
    }
    public CircularArrayQueue(int size) {
        queue = new int[size];
    }

    void enqueue(int data){
        if(isEmpty()){
            front = rear =0;
            queue[rear]=data;
        }else if(isFull()){
            throw new ArithmeticException("this circular queue is full");
        }else {
            rear =(rear+1)% queue.length;
            queue[rear]=data;
        }
    }
    void deQueue(){
        if (isEmpty()){
            throw new ArithmeticException("this queue is empty");
        }else if(front == rear){
            front = rear =-1;
        }else{
            System.out.println(queue[front]);
            front = (front+1)% queue.length;
        }
    }

    public void printQueue(){
        if (isEmpty()){
            throw new ArithmeticException("this que is empty");
        }else{
            int i =front;
            while (i!=rear){
                System.out.print(queue[i]+",");
                i =(i+1)% queue.length;
            }
            System.out.print(queue[i]);
            System.out.println();
        }
    }

    public boolean isFull(){
        return rear+1 == queue.length;
    }
    public boolean isEmpty(){
        return front==-1 && rear==-1;
    }
}
