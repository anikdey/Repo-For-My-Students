package saccha;

public class ArrayBasedQueue {

    int head=-1;
    int tail =-1;
    private int[] queue;

    public ArrayBasedQueue(){
        queue = new int[10];
    }
    public ArrayBasedQueue(int size){
        queue = new int[size];
    }

    public boolean isEmpty(){
        return tail == -1;
    }
    public boolean isFull(){
        return queue.length == tail+1;
    }

    public void enQueue(int data){
        if(isEmpty()){
            head =0;
        }else if(isFull()){
            int[] temp =queue;
            queue = new int[queue.length*2];
            for (int i = head; i < temp.length; i++) {
                queue[i]=temp[i];
            }head=0;
        }
        tail++;
        queue[tail]=data;
    }
    public int deQueue() throws Exception {
        if (isEmpty()){
            throw new Exception("queue is empty");
        }else if(queue.length/2 == tail-head+1){
            int[] temp =queue;
            queue = new int[queue.length/2];
            int index =0;
            for (int i = head; i <=tail; i++) {
                queue[index]=temp[i];index++;
            }
            head=0;tail = queue.length-1;
        }
        int data = queue[head];head++;
        return data;
    }

    public void printQueue(){
        for (int i = head; i <= tail; i++) {
            System.out.print(queue[i]+", ");
        }
        System.out.println();
    }

    public int size(){
        if (isEmpty()){
            return 0;
        }else{
            return tail-head+1;
        }

    }
}
