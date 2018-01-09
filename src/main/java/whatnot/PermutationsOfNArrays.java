package whatnot;

import java.util.Stack;

public class PermutationsOfNArrays {

    public static void main(String[] args) {
        int arr[][] = {{1, 2}, {3, 4}, {5, 6}};
        PermutationsOfNArrays permutationsOfNArrays = new PermutationsOfNArrays();
        Stack stack = new Stack();
        permutationsOfNArrays.findPermutations(arr, stack);
    }

    private void findPermutations(int[][] arr, Stack stack) {
        if (stack.size() == arr.length) {
            System.out.println(stack);
            return;
        }
        int array[] = arr[stack.size()];
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
            findPermutations(arr, stack);
            stack.pop();
        }

    }
}
