import java.util.Queue;
import java.util.Stack;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        QueueWithArray queue =new QueueWithArray(5);
        queue.enqueue(10);
        queue.enqueue(12);
        queue.enqueue(15);
        queue.enqueue(20);
        queue.enqueue(23);
//        System.out.println(queue.isFull());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
//        System.out.println(queue.isEmpty());
        queue.enqueue(25);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(29);
        System.out.println(queue.dequeue());
        queue.enqueue(40);
        queue.enqueue(50);
//        System.out.println(queue.isFull());
//        System.out.println(queue.isEmpty());
    }

    public static void reverseQueue(QueueWithArray queue){
        Stack<Integer> stack=new Stack<>();
        while (!queue.isEmpty())
            stack.push(queue.dequeue());
        while (!stack.isEmpty())
            queue.enqueue(stack.pop());
    }
}
