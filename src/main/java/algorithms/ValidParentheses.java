package algorithms;

import java.util.Stack;

//  https://leetcode.com/problems/valid-parentheses/description/
public class ValidParentheses {

    public static void main(String[] args) {

        String s = "(";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        for (char current : s.toCharArray()) {
            if (stack.empty()) {
                stack.push(current);
                continue;
            }

            char previous = stack.peek();

            if (current == '(' || current == '[' || current == '{') {
                stack.push(current);
            } else {
                switch (current) {
                    case ')':
                        if (previous != '(') {
                            return false;
                        }
                        stack.pop();
                        break;
                    case ']':
                        if (previous != '[') {
                            return false;
                        }
                        stack.pop();
                        break;
                    case '}':
                        if (previous != '{') {
                            return false;
                        }
                        stack.pop();
                        break;
                }
            }

        }
        return stack.isEmpty();
    }

}
