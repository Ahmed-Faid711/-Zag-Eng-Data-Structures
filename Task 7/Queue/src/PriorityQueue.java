import java.util.Arrays;
import java.util.NoSuchElementException;

public class PriorityQueue {
    static int[] array;
    static int size;
    static int count;

    public PriorityQueue() {
        size = 50;
        array = new int[size];
    }
    public PriorityQueue(int n) {
        size = n;
        array = new int[size];
    }
    public int getIndex(int item) {        //O(1)
        int i =count-1;
        for (;i>=0;i--) {
            if (array[i]>item)
                array[i+1]=array[i];
            else
                break;
        }
        return i+1;
    }
    public void enqueue(int item) {        //O(1)
        if (isFull())
            throw new NoSuchElementException("The queue is full");
        array[getIndex(item)]=item;
        count++;
    }
    public int dequeue() {        //O(1)
        if (isEmpty())
            throw new NoSuchElementException("The queue is empty");
        int temp=array[0];
        for (int i = 0; i < count ; i++) {
            array[i] =array[i+1];
            count--;
        }
        return temp;
    }

    public int peek() {        //O(1)
        if (isEmpty())
            throw new NoSuchElementException("The queue is empty");
        return array[0];
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

