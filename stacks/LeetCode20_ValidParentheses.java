package stacks;

public class LeetCode20_ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("()")); // true
        System.out.println(isValid("()[]{}")); // true
        System.out.println(isValid("(]")); // false
        System.out.println(isValid("([])")); // true
        System.out.println(isValid("([)]")); // false
        System.out.println(isValid("([{}])")); // true
    }

    public static boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int top = -1;

        for (char character : s.toCharArray()) {
            if (character == '(' || character == '{' || character == '[') {
                stack[++top] = character;
            } else {
                if (top == -1) {
                    return false;
                }
                char open = stack[top--];
                if ((character == ')' && open != '(') ||
                        (character == '}' && open != '{') ||
                        (character == ']' && open != '[')) {
                    return false;
                }
            }
        }

        return top == -1;
    }
}
