import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Problem1 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            int item = input.nextInt();
            if (item > M || item<1)
                throw new Exception("non valid input");
            array[i] = item;
        }
        FreqArray freqArray = new FreqArray();
        int[] array1 = freqArray.getArray(array,M);
        printArray(array1);
    }

    private static void printArray(int[] array1) {
        for (int i = 1; i < array1.length; i++) {
            if (array1[i] != 0)
                System.out.println(array1[i]);
        }
    }
}