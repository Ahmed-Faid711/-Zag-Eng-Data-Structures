import java.util.HashMap;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Character, Integer> hashMap = new HashMap<>(26);
        String string = input.next();
        for (int i = 0; i < string.length(); i++) {
            if (!hashMap.containsKey(string.charAt(i)))
                hashMap.put(string.charAt(i), 1);
            else {
                int value = hashMap.get(string.charAt(i));
                hashMap.put(string.charAt(i), value + 1);
            }
        }
        int max=0 ,maxChar=0;
        for (int i = 0; i < string.length(); i++) {
            if (hashMap.get(string.charAt(i))>max){
                max=hashMap.get(string.charAt(i));
                maxChar=string.charAt(i);
            }
        }
        System.out.println((char)(maxChar));
    }
}
