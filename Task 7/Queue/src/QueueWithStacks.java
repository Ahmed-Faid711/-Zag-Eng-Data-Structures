import java.util.EmptyStackException;
import java.util.Stack;

public class QueueWithStacks {
    private final Stack<Integer> stack1 = new Stack<>();
    private final Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int item) {
        stack1.push(item);
    }

    public int dequeue() {
        if (isEmpty())
            throw new EmptyStackException();
        if (stack2.isEmpty())
            Move();
        return stack2.pop();
    }

    public int peek() {
        if (isEmpty())
            throw new EmptyStackException();
        if (stack2.isEmpty())
            Move();
        return stack2.peek();
    }

    private void Move() {
        while (!stack1.isEmpty()) stack2.push(stack1.pop());
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public int size() {
        return stack1.size() + stack2.size();
    }
}