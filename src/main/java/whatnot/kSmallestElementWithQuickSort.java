package whatnot;

public class kSmallestElementWithQuickSort {

    public static void main(String[] args) {
        int input[] = {4, 5, 1, 6, 2, 7, 3, 8};
        kSmallestElementWithQuickSort kSmallestElementWithQuickSort = new kSmallestElementWithQuickSort();
        kSmallestElementWithQuickSort.getSmallestElements(input);
    }

    private void getSmallestElements(int[] input) {
        int k = 3;
        int start = 0;
        int end = input.length - 1;
        int index = 0;
        index = partition(start, end, input);
        while(index!=k-1){
            if(index>k-1){
                end=index-1;
                index= partition(start, end, input);

            }else{
                start=index+1;

                index= partition(start, end, input);
            }

        }
        for(int i=0;i<k;i++){
            System.out.println(input[i]);
        }
    }

    private int partition(int start, int end, int[] input) {
        int pi = input[end];
        int i = start;
        int j = i - 1;
        for (i = start; i <= end; i++) {
            if (pi > input[i]) {
                j = j + 1;
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
            }

        }
        if (input[end] < input[j + 1]) {
            int temp=input[j+1];
            input[j+1]=input[end];
            input[end]=temp;
        }
        return j+1;
    }

    private void quickSort(int start, int end, int[] input, int k) {
        if (end > start) {
            quickSort(start, k - 1, input, k);
            quickSort(k, end, input, k);

        }

    }

}
