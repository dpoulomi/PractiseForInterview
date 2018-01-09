package whatnot.Practise.practiseid;

import java.util.Stack;

public class BalancedParathesis {

    public static void main(String[] args) {
        char a[] = {'{', '(', ')', '}', '[', ']',};
        BalancedParathesis balancedParathesis = new BalancedParathesis();
        System.out.println(balancedParathesis.findBalancedPArathesis(a));
    }

    private boolean isMatching(char a, Stack<Character> stack) {
            if (stack.isEmpty()) {
                return false;
            }
            if (a == ')' && stack.peek() == '(') {
                stack.pop();
                return true;
            } else if (a == '}' && stack.peek() == '{') {
                stack.pop();
                return true;
            } else if (a == ']' && stack.peek() == '[') {
                stack.pop();
                return true;
            } else {
                return false;
            }

    }

    private boolean findBalancedPArathesis(char[] a) {
        Stack<Character> stack = new Stack<>();
        int length = a.length - 1;
        for (int i = 0; i <= length; i++) {
            if (a[i] == '(' || a[i] == '{' || a[i] == '[') {
                stack.push(a[i]);
            } else if (a[i] == ')' || a[i] == '}' || a[i] == ']') {

                if (stack.isEmpty()) {
                    return false;
                } else if (!isMatching(a[i], stack)) {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }


}