package whatnot;

import java.util.Arrays;

public class SumEqualsZero1 {



    public static void main(String[] args) {
        int arr[] = {1, 2, -4, 7, -11, 15};

        SumEqualsZero1 sumEqualsZero = new SumEqualsZero1();
        System.out.println(sumEqualsZero.findIfSumEqualsZero(arr));
    }

    private boolean findIfSumEqualsZero(int[] arr) {
        boolean found = false;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            int sum = -arr[i];
            found = findPair(arr, sum, i);
            if (found) {
                break;
            }

        }
        return found;
    }

    private boolean findPair(int[] arr,int val, int excluded) {
        int i = 0;
        int j = arr.length - 1;
        while (j > i) {
            if(j==excluded){
                j--;
            }if(i==excluded){
                i++;
            }
            if (arr[i] + arr[j] == val) {
                return true;

            } else if (arr[i] + arr[j] > val) {
                j--;


            } else {
                i++;
            }

        }
        return false;
    }
}
