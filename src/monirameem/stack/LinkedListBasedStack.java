package monirameem.stack;

public class LinkedListBasedStack<T> {

    private int size = 0;
    private Node<T> top;

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void push(T data){
        top = new Node<>(data, top);
        size++;
    }

    public T pop(){
        Node<T> temp = top;
        if (temp == null)
            return null;
        top = top.next;
        size--;
        return temp.data;
    }

    public void print(){
        Node<T> temp = top;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static class Node<T> {

        private T data;
        private Node<T> next;

        Node(T data, Node<T> next){
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public Node<T> getNext() {
            return next;
        }
    }

    public static void main(String[] args) {

        LinkedListBasedStack<Integer> stack = new LinkedListBasedStack<>();
        System.out.println(stack.pop());
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.print();
        System.out.println(stack.size());
        stack.pop();
        stack.print();

    }
}
