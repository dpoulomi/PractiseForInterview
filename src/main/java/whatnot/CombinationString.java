package whatnot;

import java.util.Stack;

public class CombinationString {
    public static void main(String[] args) {
        CombinationString combinationString = new CombinationString();
        String s = "abc";
        for (int i = 1; i <= s.length(); i++) {
            combinationString.findCombination(s, 0, i);
        }
    }

    private Stack stack = new Stack();

    private void findCombination(String s, int index, int number) {
        if (number == 0) {
            System.out.println(stack);
            return;

        }
        if (index == s.length()) {
            return;
        }

        stack.push(s.charAt(index));
        findCombination(s, index + 1, number - 1);
        stack.pop();
        findCombination(s, index + 1, number);

    }
}
