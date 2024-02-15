import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String S = input.next();
        S=S.toLowerCase();
        int[] array = new int[S.length()];
        for (int i = 0; i < S.length(); i++) {
            array[i] = (S.charAt(i) - 'a');
        }
        FreqArray freqArray = new FreqArray();
        int[] array1 = freqArray.getArray(array, 27);
        printArray(array1);
    }

    private static void printArray(int[] array1) {
        for (int i = 0; i < array1.length - 1; i++) {
            if (array1[i] != 0)
                System.out.println((char) (i + 'a') + ":" + array1[i]);
        }
    }
}
