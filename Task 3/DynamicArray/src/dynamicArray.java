public class dynamicArray {
    int size;
    int[] array;
    int count=0;
    public dynamicArray(int n) {
        size = n;
        array = new int[size];
    }

    public  dynamicArray() {
        size = 100;
        array = new int[size];
    }

    public void insert(int value) {
        if (count == size)
            creatArray();

        array[count] = value;
        count++;
    }

    private void creatArray() {
        size = size * 2;
        int[] newArray = new int[size];
        for (int i = 0; i < count; i++)
            newArray[i] = array[i];
        array = newArray;
    }

    public void removeAt(int index) {
        if(index>=0&&index<count){
        for (int i = index; i < count; i++)
            array[i] = array[i + 1];
        count--;
        }
        else System.out.println("your value doesn't exist");
    }

    public int indexOf(int value) {
        for (int i = 0; i < count; i++)
            if (value == array[i])
                return i;

        return -1;

    }

    public void remove(int value) {
        int x = indexOf(value);
        if (x != -1)
            removeAt(x);

        else System.out.println("your value doesn't exist");
    }
    public int at(int index){
        for (int i=0 ;i<count;i++)
            if (array[index] == array[i])
                return array[i];

        return -1;
    }
    public int max() {
        int max = 0;
        for (int i = 0; i < count; i++)
            if (max < array[i])
                max = array[i];
        return max;
    }

    public int min() {
        int min = array[0];
        for (int i = 0; i < count; i++)
            if (min > array[i])
                min = array[i];
        return min;
    }


    public void printArray() {
        for (int i = 0; i < count; i++)
            System.out.println(array[i]);
    }


}

