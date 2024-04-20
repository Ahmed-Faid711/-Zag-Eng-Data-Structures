import java.util.ArrayList;

public class Tree {
    private Node root;
    private Node current;
    private Node parent;

    private class Node {

        int value;
        Node right;
        Node left;

        public Node(int value) {
            this.value = value;
        }
    }

    public void insert(int value) {
        Node node = new Node(value);
        if (root == null) root = node;

        else {
            Node parent = getParent(value);
            if (value > parent.value) parent.right = node;
            else parent.left = node;
        }
    }

    public boolean find(int value) {
        if (root == null) return false;
        else {
            current = root;
            while (current != null) {
                if (value == current.value) {
                    return true;
                }
                if (value > current.value) current = current.right;

                else current = current.left;
            }
            return false;
        }
    }

    private Node getParent(int value) {
        current = root;
        while (current != null) {
            parent = current;
            if (value >= current.value) current = current.right;

            else current = current.left;
        }
        return parent;
    }

    public int max() {
        int max = root.value;
        current = root;
        while (current != null) {
            max = current.value;
            current = current.right;
        }
        return max;
    }

    public int min() {
        int min = root.value;
        current = root;
        while (current != null) {
            min = current.value;
            current = current.left;
        }
        return min;
    }

    public void preOrderTraverse() {
        preOrderTraverse(root);
    }

    public void inOrderTraverse() {
        inOrderTraverse(root);
    }

    public void postOrderTraverse() {
        postOrderTraverse(root);
    }

    public void ascendingOrder() {
        inOrderTraverse(root);
    }

    public void descendingOrder() {
        descendingOrder(root);
    }

    private void preOrderTraverse(Node root) {
        if (root == null) return;
        System.out.println(root.value);
        preOrderTraverse(root.left);
        preOrderTraverse(root.right);
    }

    private void inOrderTraverse(Node root) {
        if (root == null) return;
        inOrderTraverse(root.left);
        System.out.println(root.value);
        inOrderTraverse(root.right);
    }

    private void postOrderTraverse(Node root) {
        if (root == null) return;
        postOrderTraverse(root.left);
        postOrderTraverse(root.right);
        System.out.println(root.value);
    }

    private void descendingOrder(Node root) {
        if (root == null) return;
        descendingOrder(root.right);
        System.out.println(root.value);
        descendingOrder(root.left);
    }
    public int height(){
        return height(root);
    }
    private boolean isLeaf(Node node) {
        return node.left==null&&node.right==null;
    }
    private int height(Node root) {
       if (root==null)
           return -1;
       if (isLeaf(root))
           return 0;
       return 1+Math.max(height(root.left),height(root.right));
    }
    public boolean equals(Tree tree){
        return equals(tree.root,root);

    }
    private boolean equals(Node root1,Node root2){
        if (root1==null&&root2==null)
            return true;
        if (root1!=null&&root2!=null)
            return root1.value==root2.value&&
                    equals(root1.left,root2.left)&&
                    equals(root1.right,root2.right);
        return false;
    }

    public ArrayList<Integer> kthElementFromRoot(int d){
        ArrayList<Integer> list=new ArrayList<>();
        kthElementFromRoot(root,d,list);
        return list;
    }
    private void kthElementFromRoot(Node root, int d,ArrayList<Integer> list){
        if (root==null)
            return;
        if (d==0)
            list.add(root.value);

        kthElementFromRoot(root.left,d-1,list);
        kthElementFromRoot(root.right,d-1,list);
    }
    public void levelOrder(){
        for (int i = 0; i <= height(); i++) {
            var list= kthElementFromRoot(i);
            System.out.println(list);
        }
    }
}
