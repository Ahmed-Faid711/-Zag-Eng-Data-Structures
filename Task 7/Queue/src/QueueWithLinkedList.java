import java.util.EmptyStackException;
import java.util.LinkedList;

public class QueueWithLinkedList {
    LinkedList<Integer> list=new LinkedList<>();
    public void enqueue(int item){
        list.addFirst(item);
    }
    public int dequeue(){
        if (list.isEmpty())
            throw new EmptyStackException();
        int item=list.getLast();
        list.removeLast();
        return item;
    }
    public int peek(){
        if (list.isEmpty())
            throw new EmptyStackException();
        return list.getLast();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
    public int size(){
        return list.size();
    }
}
