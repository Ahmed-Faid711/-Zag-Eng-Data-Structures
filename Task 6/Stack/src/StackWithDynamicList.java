import java.util.EmptyStackException;

public class StackWithDynamicList {
    int[] array;
    int count=0;

    int size=0;

    public StackWithDynamicList() {
        size = 50;
        array = new int[size];
    }

    public StackWithDynamicList(int size) {
        this.size = size;
        array = new int[size];
    }

    public void push(int value) {
        if (count == size)
            creatArray();

        array[count] = value;
        count++;
    }
    public int pop(){
        if (isEmpty())
            throw new EmptyStackException();
        int temp=array[count-1];
        count--;
        return temp;
    }
    public int peek(){
        if (isEmpty())
            throw new EmptyStackException();
        return array[count-1];
    }

    private void creatArray() {
        size *=2;
        int[] newArray = new int[size];
        for (int i = 0; i < count; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }
    public boolean isEmpty(){
        return count==0;
    }

}
