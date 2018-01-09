package whatnot;

import java.util.Stack;

public class PushPopSequenceofStack {
    public static void main(String[] args) {
        PushPopSequenceofStack pushPopSequenceofStack = new PushPopSequenceofStack();
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {1,3,4,5,2};
        System.out.println(pushPopSequenceofStack.checkPoppingSequence(arr1, arr2));
    }

    Stack<Integer> stack = new Stack<>();

    private boolean checkPoppingSequence(int[] arr1, int[] arr2) {
        int j = 0;
        for (int i = 0; i < arr1.length; i++) {
            stack.add(arr1[i]);
            while (!stack.isEmpty() && stack.peek() == arr2[j]) {
                if(j==arr2.length-1){
                    return true;

                }
                j++;
                stack.pop();
            }


        }
      /* *//* if (j == arr2.length - 1) {
           *//* return true;
      //  }*/
        return false;
    }
}
