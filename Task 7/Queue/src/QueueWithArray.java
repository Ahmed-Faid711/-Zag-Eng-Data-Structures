import java.util.Arrays;
import java.util.NoSuchElementException;

public class QueueWithArray {
    static int[] array;
    static int size;
    static int count;
    static int last;
    static int first;

    public QueueWithArray() {
        size = 50;
        array = new int[size];
    }
    public QueueWithArray(int n) {
        size = n;
        array = new int[size];
    }

    public void enqueue(int value) {        //O(1)
        if (isFull())
            throw new NoSuchElementException("The queue is full");
        array[last] = value;
        count++;
        last=(last+1)%size;
    }
    public int dequeue() {        //O(1)
        if (isEmpty())
            throw new NoSuchElementException("The queue is empty");
        int temp=array[first];
        array[first]=0;
        count--;
        first=(first+1)%size;
        return temp;
    }
    public int peek() {        //O(1)
        return array[first];
    }
    public boolean isEmpty(){        //O(1)
        return count==0;
    }
    public boolean isFull(){        //O(1)
        return count==size;
    }
    public int getSize(){        //O(1)
        return count;
    }
    public void printQueue(){
       String s= Arrays.toString(array);
        System.out.println(s);
    }

}




