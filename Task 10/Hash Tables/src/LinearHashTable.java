import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class LinearHashTable{
    int[] keys;
    String[] values;
    int count;

    public LinearHashTable(int size) {
        keys = new int[size];
        values = new String[size];

    }

    public int hash(int key) {
        return key % keys.length;
    }

    public void put(int key, String value) {
        int index = hash(key);
        while (keys[index] != 0) {
            if (keys[index] == key) {
                values[index] = value;
                return;
            }
            index = hash(index + 1);
        }
        keys[index] = key;
        values[index] = value;
        count++;
    }

    public String get(int key) {
        int index = hash(key);
        while (keys[index] != 0) {
            if (keys[index] == key)
                return values[index];
            index = hash(index + 1);
        }
        return null;
    }

    public void remove(int key) {
        int index = hash(key);
        while (keys[index] != 0) {
            if (keys[index] == key) {
                keys[index] = 0;
                values[index] = null;
                count--;
                return;
            }
            index = hash(index + 1);
        }
        throw new NoSuchElementException();
    }

    public int size() {
        return count;
    }

    public void printTable() {                       //from chatGPT to check code
        for (int i = 0; i < keys.length; i++) {
            if (keys[i] != 0) {
                System.out.println("Key: " + keys[i] + ", Value: " + values[i]);
            }
        }
    }
}
