package whatnot;

import java.util.Stack;

public class StackWithPushPopMin {

    public static void main(String[] args) {
        StackWithPushPopMin stackWithPushPopMin=new StackWithPushPopMin();
        stackWithPushPopMin.stackOperations();
    }

    private void stackOperations() {

        push(1);
        pop();
        min();
    }

    private void min() {
    }


    private Stack<Integer> stack=new Stack<>();
    public void push(int num){
stack.push(num);


    }
    private void pop(){
      stack.pop();

    }


}
