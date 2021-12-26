package saccha.queue;

public class CircularArrayQueue {

    int front = -1;
    int rear = -1;
    int size=0;
    private int[] queue;

    public CircularArrayQueue(){
        queue = new int[10];
    }
    public CircularArrayQueue(int size) {
        queue = new int[size];
    }

    void enqueue(int data) throws Exception {
        if(isEmpty()){
            front = rear =0;
            queue[rear]=data;
            size++;
        }else if(isFull()){
            throw new Exception("this circular queue is full");
        }else {
            rear =(rear+1)% queue.length;
            queue[rear]=data;
            size++;
        }
    }
    void deQueue() throws Exception {
        if (isEmpty()){
            throw new Exception("this queue is empty");
        }else if(front == rear){
            front = rear =-1;
            size=0;
        }else{
            System.out.println(queue[front]);
            front = (front+1)% queue.length;
            size--;
        }
    }

    public void printQueue() throws Exception {
        if (isEmpty()){
            throw new Exception("this que is empty");
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

    public int getSize(){
       return size;
    }

    public boolean isFull(){
        return rear+1 == queue.length;
    }
    public boolean isEmpty(){
        return front==-1 && rear==-1;
    }
}
