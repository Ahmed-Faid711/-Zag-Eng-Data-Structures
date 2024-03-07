import java.util.LinkedList;
import java.util.NoSuchElementException;

public class ChainingHashTable{
    int count;

    public static class Node {
        int key;
        String value;

        public Node() {
        }

        public Node(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    LinkedList<Node>[] table;

    ChainingHashTable(int size) {
        table = new LinkedList[size];
    }

    public int hash(int key) {
        return key % table.length;
    }

    public void put(int key, String value) {
        int index = hash(key);
        Node node = new Node();
        node.key = key;
        node.value = value;
        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }
        for (Node n : table[index]) {
            if (n.key == key) {
                n.value = value;
                return;
            }
        }
        table[index].add(node);
        count++;
    }

    public String get(int key) {
        int index = hash(key);
        if (table[index] == null) {
            return null;
        }
        for (Node n : table[index])
            if (key == n.key)
                return n.value;
        return null;
    }

    public void remove(int key) {
        int index = hash(key);
        if (table[index] == null) {
            throw new NoSuchElementException();
        }
        for (Node n : table[index]) {
            if (key == n.key) {
                table[index].remove(n);
                count--;
                return;
            }
        }
        throw new NoSuchElementException();
    }

    public int size() {
        return count;
    }

    public void checkValues() {                             // from chatGPT to check code
        for (int i = 0; i < table.length; i++) {
            LinkedList<Node> bucket = table[i];
            if (bucket != null) {
                System.out.print("Bucket " + i + ": ");
                for (Node node : bucket) {
                    System.out.print("(" + node.key + ", " + node.value + ") ");
                }
                System.out.println();
            }
        }
    }
}
