import java.util.NoSuchElementException;

public class LinkedList {
    private Node first = null;
    private Node last = null;
    private int size = 0;

    private class Node {
        int value;
        Node nextNode;

        Node() {

        }

        public Node(int value) {
            this.value = value;
        }

    }

    public void addFirst(int value) {          //O(1)
        Node node = new Node(value);
        if (isEmpty())
            first = last = node;
        else {
            node.nextNode = first;
            first = node;
        }
        size++;
    }

    public void addLast(int value) {          //O(1)
        Node node = new Node(value);
        if (isEmpty())
            first = last = node;
        else {
            last.nextNode = node;
            last = node;
        }
        size++;
    }

    public void removeFirst() {          //O(1)
        throwException();
        if (isEqual())
            first = last = null;
        else {
            Node node = first;
            first = first.nextNode;
            node = null;
        }
        size--;
    }

    public void removeLast() {          //O(n)
        throwException();
        if (isEqual())
            first = last = null;
        else {
            last = getPrevious();
            last.nextNode = null;
        }
        size--;
    }

    private Node getPrevious() {
        Node previous = first;
        Node current = first;
        while (current.nextNode != null) {
            previous = current;
            current = current.nextNode;
        }
        return previous;
    }

    public int indexOf(int value) {          //O(n)
        Node current = first;
        int index = 0;
        while (current != null && current.value != value) {
            current = current.nextNode;
            index++;
        }
        if (current == null)
            return -1;
        else
            return index;
    }

    public boolean contains(int value) {          //O(n)
        return indexOf(value) != -1;
    }

    public int getSize() {          //O(1)
        return size;
    }

    public int max() {          //O(n)
        throwException();
        Node max = first;
        Node current = first;
        for (int i = 0; i < size; i++) {
            if (current.value > max.value)
                max = current;
            current = current.nextNode;
        }
        return max.value;
    }

    public int min() {          //O(n)
        throwException();
        Node min = first;
        Node current = first;
        for (int i = 0; i < size; i++) {
            if (current.value < min.value)
                min = current;
            current = current.nextNode;
        }
        return min.value;
    }

    private void throwException() {
        if (isEmpty())
            throw new NoSuchElementException();
    }

    private boolean isEmpty() {
        return first == null;
    }

    private boolean isEqual() {
        return first == last;
    }

    public void printElements() {          //O(n)
        Node node = first;
        for (int i = 0; i < size; i++) {
            int x = node.value;
            node = node.nextNode;
            System.out.println(x);
        }
    }
}
