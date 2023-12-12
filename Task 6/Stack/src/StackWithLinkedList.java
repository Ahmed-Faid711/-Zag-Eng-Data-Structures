import java.util.EmptyStackException;

public class StackWithLinkedList {
    private class Node {
        int value;
        Node nextNode;
        public Node(int value) {
            this.value = value;
        }
    }

    Node first = null;
    Node last = null;
    int size = 0;

    public void push(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            first = last = node;
        } else {
            node.nextNode = first;
            first = node;
        }
        size++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            Node pop = first;
            first = first.nextNode;
            size--;
            return pop.value;
        }
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            return first.value;
        }
    }

    public boolean isEmpty() {
        return first == null;
    }

}
