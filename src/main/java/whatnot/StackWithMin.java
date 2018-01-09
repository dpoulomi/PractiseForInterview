package whatnot;

import java.util.Stack;

public class StackWithMin {

    public static final int LEAST_VALUE = 0;
    public static final int MIN_OFFSET = 2;
    private Stack<Integer> stack = new Stack<>();
    private int min = 0;

    public static void main(String[] args) {
        StackWithMin stackWithMin = new StackWithMin();
        stackWithMin.performFuntions();

    }

    private void performFuntions() {
        push(0);
        push(1);
        push(-1);
        push(2);
        push(5);
        push(-1);
        push(-2);

        System.out.println(min());
        pop();
        System.out.println(min());

        pop();
        pop();
        System.out.println(min());
        pop();
        System.out.println(min());
        pop();
        pop();
        pop();
        pop();
        System.out.println(min());
    }

    private int min() {
        if (stack.size() > LEAST_VALUE) {
            return min;
        }
        throw new IllegalStateException("stack is empty");
    }

    private void pop() {
        if (stack.size() > LEAST_VALUE) {
            int peek = stack.peek();
            if (peek < min) {
                min = MIN_OFFSET * min - peek;
            }
            stack.pop();
        }
    }


    private void push(int val) {
        if (stack.size() == 0) {
            stack.push(val);
            min = val;

        } else if (val >= min) {
            stack.push(val);

        } else {
            stack.push(2 * val - min);
            min = val;
        }
    }
}
