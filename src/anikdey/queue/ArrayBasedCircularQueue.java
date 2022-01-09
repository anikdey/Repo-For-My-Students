package anikdey.queue;

import java.util.EmptyStackException;

public class ArrayBasedCircularQueue {

    private int rear = -1;
    private int front = -1;
    private int[] queue;

    public ArrayBasedCircularQueue(int size) {
        queue = new int[size];
    }

    public void enqueue(int data) {
        if(rear == -1 && front == -1) {
            rear++;
            front++;
            queue[rear] = data;
        } else if((rear +1) % queue.length == front) {
            System.out.println("Queue is full");
        } else {
            rear = (rear +1) % queue.length;
            queue[rear] = data;
        }
    }

    public int dequeue() {
        if(front == -1 && rear == -1){
            throw new EmptyStackException();
        }
        int data = queue[front];
        if(front == rear) {
            front = rear = -1;
        } else {
            front = (front+1)%queue.length;
        }
        return data;
    }

    public void printQueue() {
        if(front != rear) {
            if(front<=rear) {
                for(int i=front; i<=rear; i++) {
                    System.out.print(queue[i]+", ");
                }
                System.out.println();
            } else {
                for (int i=rear; i<queue.length; i++) {
                    System.out.print(queue[i]+", ");
                }
                for(int i=0; i<=front; i++) {
                    System.out.print(queue[i]+", ");
                }
                System.out.println();
            }
        }
    }


    public static void main(String[] args) {
        ArrayBasedCircularQueue queue = new ArrayBasedCircularQueue(3);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        //queue.printQueue();

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

    }






}
