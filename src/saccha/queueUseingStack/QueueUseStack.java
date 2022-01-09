package saccha.queueUseingStack;

public class QueueUseStack {
    private int[] stack1;
    private int[] stack2;
    int size =0;
    int top1=-1;
    int top2=-1;
    public QueueUseStack(){
        stack1 = new int[10];
        stack2 = new int[10];
    }
    public QueueUseStack(int size){
        stack1 = new int[size];
        stack2 = new int[size];
    }
    public void push(int data){
        if (top1 == stack2.length-1){
            throw new StackOverflowError();
        }else {
            top1++;
            stack1[top1]=data;
        }
    }
    public void enqueue(int data){
        push(data);size++;
    }
    public void push2(int data){
        if (top2 == stack2.length-1){
            throw new StackOverflowError();
        }
        else {
            top2++;
            stack2[top2]=data;
        }
    }
    public int dequeue() throws Exception {
        if (top1 ==-1 && top2==-1){
            throw new Exception("queue is empty");
        }else {
            for (int i =0;i<size;i++){
                push2(pop());
            }
            int data =pop2();
            size--;
            for (int i = 0; i <size ; i++) {
                push(pop2());
            }
            return data;
        }
    }
    void print(){
        for (int i = 0; i <= top1; i++) {
            System.out.print(stack1[i]+",");
        }
        System.out.println();
    }

    private int pop2() {
        return stack2[top2--];
    }

    private int pop() {
        return stack1[top1--];
    }

    public static void main(String[] args) throws Exception {
        QueueUseStack queue = new QueueUseStack(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.print();
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.print();
    }
}
