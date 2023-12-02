
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(10);
        linkedList.addFirst(15);
        linkedList.addFirst(20);
        linkedList.addFirst(25);
        System.out.println(linkedList.max());
        linkedList.printElements();
    }
}