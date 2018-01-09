package whatnot;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class kSmallestElements {

    class ReverseComparator implements Comparator<Integer> {

        public int compare(Integer num1, Integer num2) {

            if (num1 < num2) {
                return 1;
            } else if (num1 == num2) {
                return 0;
            } else {
                return -1;
            }
        }
    }

    public static void main(String[] args) {
        int input[] = {4, 5, 1, 6, 2, 7, 3, 8};
        kSmallestElements kSmallestElement = new kSmallestElements();
        kSmallestElement.getSmallestkElements(input);
    }

    private void getSmallestkElements(int[] input) {
        int output[] = new int[3];
        ReverseComparator comparator = new ReverseComparator();
        PriorityQueue<Integer> max = null;
        max = new PriorityQueue<>(1, comparator);
        insert(max, input, output.length);
        Iterator<Integer> iter=max.iterator();
        for(int i=0;i<output.length;i++){
            output[i]=iter.next();
            System.out.println(output[i]);
        }
    }

    private void insert(PriorityQueue<Integer> max, int[] input, int length) {
        for (int i = 0; i < input.length; i++) {
            if (max.size() < length) {

                max.add(input[i]);
            } else {
                int maxNum = max.peek();
                if (maxNum > input[i]) {

                    max.poll();

                    max.add(input[i]);

                }

            }
        }
    }


}