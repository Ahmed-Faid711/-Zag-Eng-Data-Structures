import java.util.Stack;

public class BalancedBrackets {
    public boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        char ch;
        for (int i = 0; i < expression.length(); i++) {
            ch = expression.charAt(i);
            if (isOpenBracket(ch))
                stack.push(ch);
            else if (isCloseBracket(ch)) {
                if (!isMatch(stack.pop(), ch))
                    return false;
            }
        }
        return stack.isEmpty();
    }

    private boolean isMatch(char open, char close) {
        return open == '(' && close == ')' ||
                open == '{' && close == '}' ||
                open == '[' && close == ']' ||
                open == '<' && close == '>';
    }

    private boolean isCloseBracket(char ch) {
        return ch == ')' || ch == '}' || ch == ']' || ch == '>';
    }

    private boolean isOpenBracket(char ch) {
        return ch == '(' || ch == '{' || ch == '[' || ch == '<';
    }
}


