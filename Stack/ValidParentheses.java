package Stack;

import java.util.Deque;
import java.util.ArrayDeque;

public class ValidParentheses {

    static boolean isValidParentheses(String str) {

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Opening brackets → push
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // Closing brackets → compare immediately
            else if (ch == ')' || ch == '}' || ch == ']') {

                // No opening to match
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                // Type mismatch
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // All openings must be closed
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        System.out.println(isValidParentheses("()"));        // true
        System.out.println(isValidParentheses("()[]{}"));    // true
        System.out.println(isValidParentheses("(]"));        // false
        System.out.println(isValidParentheses("([)]"));      // false
        System.out.println(isValidParentheses("{[]}"));      // true
        System.out.println(isValidParentheses("()[}"));      // false
    }
}
