package whatnot;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumConcatenatedNumber {

    class NumericComparator implements Comparator<String> {
        public int compare(String num1, String num2) {
            String str1 = num1 + num2;
            String str2 = num2 + num1;
            return str1.compareTo(str2);
        }
    }

    public static void main(String[] args) {

        int arr[] = {3, 32, 321};
        MinimumConcatenatedNumber minimumConcatenatedNumber = new MinimumConcatenatedNumber();
        minimumConcatenatedNumber.PrintMinNumber(arr);
    }

    void PrintMinNumber(int numbers[]) {
        String strNumbers[] = new String[numbers.length];
        for (int i = 0; i < numbers.length; ++i) {
            strNumbers[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(strNumbers, new MinimumConcatenatedNumber().new NumericComparator());
        for (int i = 0; i < numbers.length; ++i)
            System.out.print(strNumbers[i]);
        System.out.print("\n");
    }
}
