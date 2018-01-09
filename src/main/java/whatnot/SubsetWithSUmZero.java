package whatnot;

import java.util.BitSet;

public class SubsetWithSUmZero {
    public static void main(String[] args) {
        int arr[] = {1, 2, -2, -3, 3, -4, 7, 9, 10, -10, 12};
        SubsetWithSUmZero subsetWithSUmZero = new SubsetWithSUmZero();
        boolean flag = subsetWithSUmZero.findSUbSet(arr);
    }

    private boolean findSUbSet(int[] arr) {

        BitSet bits = new BitSet(arr.length);
        while (increment(bits, arr)) {
            int sum = 0;
            boolean found = false;
            for (int i = 0; i < arr.length; i++) {
                if (bits.get(i)) {

                    if (!found) {
                        sum = sum + arr[i];


                    }
                }

            }
            if (sum == 0 && found) {
                return true;
            }
        }
        return false;
    }

    private boolean increment(BitSet bits, int[] arr) {
        boolean flag = false;
        int index = arr.length - 1;
        while (index >= 0 && bits.get(index)) {
            bits.clear();
            index--;
        }
        if (index < 0) {
            flag = false;
        }
        bits.set(index);
        flag = true;
        return flag;
    }

}
