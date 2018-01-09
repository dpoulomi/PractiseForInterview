package whatnot;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWIndow {

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 2, 6, 2, 5, 1};
        int no = 3;
        SlidingWIndow slidingWIndow = new SlidingWIndow();
        slidingWIndow.getArray(arr, no);
    }

    private void getArray(int[] arr, int no) {
        Deque<Integer> q = new ArrayDeque();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
            if (q.isEmpty()) {
                q.addLast(arr[i]);

            } else if (!q.isEmpty() && q.size() < no) {
                while (q.peekLast() < arr[i]) {
                    q.pollFirst();
                }
                q.addLast(arr[i]);
            }
            if (count > no - 1) {
                System.out.print(q.peekFirst());
            }
        }

    }
}
