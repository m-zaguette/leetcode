package stacks;

import java.util.Set;
import java.util.Stack;

public class LeetCode150_EvaluateReversePolishNotation {

    public static void main(String[] args) {
        System.out.println(evalRPN(new String[] { "2", "1", "+" })); // 3
        System.out.println(evalRPN(new String[] { "2", "1", "+", "3", "*" })); // 9
        System.out.println(evalRPN(new String[] { "4", "13", "5", "/", "+" })); // 6
        System.out.println(evalRPN(new String[] { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" })); // 22
        System.out.println(evalRPN(new String[] { "3", "11", "5", "+", "-" })); // -13
        System.out.println(evalRPN(new String[] { "4", "-2", "/", "2", "-3", "-", "-" })); // -7
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        Set<String> operators = Set.of("+", "-", "/", "*");
        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            if (operators.contains(token)) {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = 0;
                if (token.equals("+")) {
                    result = operand1 + operand2;
                }
                if (token.equals("-")) {
                    result = operand1 - operand2;
                }
                if (token.equals("/")) {
                    result = operand1 / operand2;
                }
                if (token.equals("*")) {
                    result = operand1 * operand2;
                }
                stack.push(result);
            } else {
                stack.push(Integer.valueOf(token));
            }
        }
        return stack.pop();
    }

}
