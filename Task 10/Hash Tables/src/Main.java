// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LinearHashTable hashTable = new LinearHashTable(5);
        hashTable.put(1, "One");
        hashTable.put(2, "Two");
        hashTable.put(6, "Six");
        hashTable.put(11, "Eleven");
        hashTable.put(3, "three");
        hashTable.remove(6);
        System.out.println(hashTable.size());
        hashTable.printTable();

    }
}