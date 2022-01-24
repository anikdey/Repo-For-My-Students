package saccha.dataStructure.tree;

public class Tree {
    private TreeNode root;
    private TreeNode branches;
    private int leftLeaf;
    private int rightLeaf;
    int size =0;

    public boolean isEmpty(){
        return  root == null;
    }

    public void add(int data){
        TreeNode node = new TreeNode(data,null,null);
        if (isEmpty()){
            root = node;
            leftLeaf = data;
        }else{
            TreeNode temp = root;
            while (true){
                if (temp.data<data){
                    if (temp.right == null){
                        temp.right = node;
                        rightLeaf = Math.max(rightLeaf,data);
                        break;
                    }
                    temp = temp.right;
                }else {
                    if (temp.left==null){
                        temp.left = node;
                        leftLeaf = Math.min(leftLeaf,data);
                        break;
                    }
                    temp = temp.left;
                }
            }

        }
        size++;
    }

    public boolean search(int data){
        if (isEmpty()){
            return false;
        }
        TreeNode temp = root;

        while (temp!=null){
            if (temp.data==data){
                return true;
            }
            if (temp.data>=data){
                temp = temp.left;
            }else{
                temp = temp.right;
            }
        }
        return false;
    }

    public int minElement(){
        if (isEmpty()){
            return Integer.MIN_VALUE;
        }else {
            return leftLeaf;
        }
    }
    public int maxElement(){
        if (isEmpty()){
            return Integer.MIN_VALUE;
        }else {
            return rightLeaf;
        }
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add(10);
        tree.add(5);
        tree.add(15);
        tree.add(11);
        tree.add(7);
        tree.add(18);
        System.out.println(tree.maxElement());
        System.out.println(tree.minElement());
        System.out.println(tree.search(19));
    }

    public class TreeNode {
        TreeNode right;
        TreeNode left;
        int data;
        public TreeNode(int data, TreeNode left, TreeNode right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
}
