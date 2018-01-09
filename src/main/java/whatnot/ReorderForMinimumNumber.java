package whatnot;

import java.util.Arrays;
import java.util.Comparator;

public class ReorderForMinimumNumber {

    class NumericComparator implements Comparator<String> {

        public int compare(String num1, String num2) {
            String cnum1 = num1 + num2;
            String cnum2 = num2 + num1;
           //maxmimum number
            return (cnum1.compareTo(cnum2) > 0 ? -1 : 1);
            //minimum number
            // return (cnum1.compareTo(cnum2)>0 ? 1 : -1);
        }
    }

    public static void main(String[] args) {
        int arr[] = {3, 32, 321};
        ReorderForMinimumNumber reorderForMinimumNumber = new ReorderForMinimumNumber();
        reorderForMinimumNumber.reorderArray(arr);
    }

    private void reorderArray(int[] arr) {

        String arrString[] = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrString[i] = String.valueOf(arr[i]);
        }
        Arrays.sort(arrString, new NumericComparator());

        for (int i = 0; i < arrString.length; i++) {
            System.out.print(arrString[i]);
        }

    }
}
