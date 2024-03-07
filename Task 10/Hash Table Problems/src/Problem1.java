import org.w3c.dom.Text;

import java.util.HashMap;
import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Character, Integer> hashMap = new HashMap<>(26);
        String string = input.next();
        for (int i = 0; i < string.length(); i++)
            if (!hashMap.containsKey(string.charAt(i)))
                hashMap.put(string.charAt(i), 1);
            else {
                int value = hashMap.get(string.charAt(i));
                hashMap.put(string.charAt(i),value+1);
            }
        System.out.println(hashMap);
    }
}