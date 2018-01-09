package whatnot;

public class SumSequence1 {



    public static void main(String[] args) {
        int arr[] = {1, 2, -4, 7, -11, 15};
        int val=15;
        SumSequence1 sumSequence = new SumSequence1();
        System.out.println(sumSequence.findPair(arr,val));
    }


    private boolean findPair(int[] arr,int val) {
        int i = 0;
        int j = arr.length - 1;
        while (j > i) {
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
