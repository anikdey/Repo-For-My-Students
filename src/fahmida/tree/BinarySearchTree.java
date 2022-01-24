package fahmida.tree;

public class BinarySearchTree {

    public static class Node{

        int data;
        Node left;
        Node right;

        public Node(int data,Node left,Node right){

            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    static int size = 0;
    Node root;

    public boolean isEmpty(){
        return size == 0;
    }

    private int getSize(){
        return size;
    }

    public void add(int data){

        Node treeNode = new Node (data,null,null);

        if(isEmpty()){
            root = treeNode;
        }
        else{

            Node prev = null;
            Node temp = root;

            while(temp != null){
                prev = temp;
                if (temp.data < data) {
                    temp = temp.right;
                } else {
                    temp = temp.left;
                }
            }
            if (prev.data < data) {
                prev.right = treeNode;
            } else {
                prev.left = treeNode;
            }
        }
        size++;
    }
    public void addProperly(int data){

        Node treeNode = new Node(data,null,null);

        if(isEmpty()){
            root = treeNode;
        }
        else {
            Node temp = root;

            while (true){

                if (temp.data < data) {
                    if (temp.right == null){
                        temp.right = treeNode;
                        break;
                    }
                    temp = temp.right;
                }
                else {
                    if (temp.left == null) {
                        temp.left = treeNode;
                        break;
                    }
                    temp= temp.left;
                }
            }
        }
        size++;
    }

    public boolean search(int data){

        if (isEmpty()){
            return false;
        }
        Node temp = root;

        while (temp != null){

            if(temp.data == data){
                return true;
            }
            else if (temp.data>=data){
                temp = temp.left;
            }else{
                temp = temp.right;
            }
        }
        return false;
    }

    public int minValue(){
        Node temp = root;

        if (isEmpty())
            return -1;

        while (temp.left != null) {
            temp = temp.left;
        }
        return temp.data;
    }

    public int maxValue(){
        Node temp = root;

        if (isEmpty())
            return -1;

        while (temp.right != null) {
            temp = temp.right;
        }
        return temp.data;
    }

    public static void main(String[] args) {
        olcode();
    }

    public static void olcode(){

        BinarySearchTree bs = new BinarySearchTree();

        System.out.println("Minimum value:" + bs.minValue());
        bs.add(34);
        bs.add(38);
        bs.add(31);
        bs.add(39);
        bs.add(89);
        System.out.println("Searching data is available:" + bs.search(34));
        System.out.println( "Minimum value of this tree:" + bs.minValue());
        System.out.println( "Maximum value of this tree:" + bs.maxValue());
    }
}
