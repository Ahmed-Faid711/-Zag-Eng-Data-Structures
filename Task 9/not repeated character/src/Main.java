import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String S = input.next();
        S = S.toLowerCase();
        int[] array = new int[26];
        for (int i = 0; i < S.length(); i++)
            array[hash(S.charAt(i))]++;

        for (int i = 0; i < S.length() - 1; i++) {
            int index = hash(S.charAt(i));
            if (array[index] == 1) {
                System.out.println((char) (S.charAt(i)));
                break;
            }
        }
    }

    public static int hash(int c) {
        return c - 'a';
    }
}
