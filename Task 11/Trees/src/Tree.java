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
        parent = root;
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
}
