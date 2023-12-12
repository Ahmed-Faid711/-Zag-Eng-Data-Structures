import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverse("nagroM ruhtrA"));
    }

    static public String reverse(String expression) {
        Stack<Character> stack = new Stack<>();
        String reversed = "";
        for (int i = 0; i < expression.length(); i++) {
            stack.push(expression.charAt(i));
        }
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }
        return reversed;
    }
}