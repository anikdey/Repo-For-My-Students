package monirameem.tree.binarySearchTree;

public class BinarySearchTree {

    static int size = 0;
    Node root;

    private int getSize() {
        return size;
    }

    public void insert(int data) {

        Node newNode = new Node(data,null,null);

        if (root == null){
            root = newNode;
        } else {

            Node prev = null;
            Node temp = root;

            while (temp != null) {
                prev = temp;
                if (temp.data < data) {
                    temp = temp.right;
                } else {
                    temp = temp.left;
                }
            }

            if (prev.data < data) {
                prev.right = newNode;
            } else {
                prev.left = newNode;
            }
        }
        size++;
    }

    public void add(int data) {
        Node newNode = new Node(data,null,null);

        if (root == null) {
            root = newNode;
        } else {

            Node temp = root;

            while (true){

                if (temp.data < data) {
                    if (temp.right == null){
                        temp.right = newNode;
                        break;
                    }
                    temp = temp.right;
                } else {
                    if (temp.left == null) {
                        temp.left = newNode;
                        break;
                    }
                    temp= temp.left;
                }
            }

        }
        size++;
    }

    public int minValue() {
        Node temp = root;

        if (temp == null)
            return -1;

        while (temp.left != null) {
            temp = temp.left;
        }
        return temp.data;
    }

    public int maxValue() {
        Node temp = root;

        if (temp == null)
            return -1;

        while (temp.right != null) {
            temp = temp.right;
        }
        return temp.data;
    }

    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(10);
        tree.insert(5);
        tree.insert(8);
        tree.insert(15);
        tree.insert(20);
        tree.insert(2);

        System.out.println(tree.maxValue());
        System.out.println(tree.minValue());

    }

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data, Node left,Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
}
