package oop.lab4;

import java.util.Stack;

public class ExpressionChecker {
    public static String checkBrackets(String str) {
        if (str.isEmpty()) return "The expression is empty";
        Stack<Character> stack = new Stack<Character>();
        for (char chr : str.toCharArray()) {
            if (chr == '(' || chr == '[' || chr == '{') {
                stack.push(chr);
            } else if (chr == ')' || chr == ']' || chr == '}') {
                if (stack.isEmpty()) {
                    return "The expression is not correct";
                }
                if (chr == ')' && stack.peek() == '(' || chr == ']' && stack.peek() == '[' || chr == '}' && stack.peek() == '{')
                    stack.pop();
                else return "The expression is not correct";
            }
        }

        if(stack.isEmpty()) return "The expression is correct";
        else return "The expression is not correct";
    }
}
