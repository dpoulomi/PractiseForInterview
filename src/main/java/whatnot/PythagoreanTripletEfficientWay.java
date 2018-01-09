package whatnot;

public class PythagoreanTripletEfficientWay {


    public static void main(String[] args) {
        int arr[] = {3, 1, 4, 6, 5};
        PythagoreanTripletEfficientWay pythagorenTriplet = new PythagoreanTripletEfficientWay();
        System.out.println(pythagorenTriplet.verifyIfTripletPresnt(arr));
    }

    private boolean verifyIfTripletPresnt(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];

        }
        quickSort(arr, 0, arr.length - 1);
        int i = 0;
        int count=0;
        int j =0;
        while (j>0){
            j=arr.length-1-count;
            while (i != j) {
                if (arr[i] + arr[j - 1] == arr[j]) {
                    return true;
                } else if (arr[i] + arr[j - 1] < arr[j]) {
                    i++;
                } else {
                    j--;
                }

            }
            count++;
    }
        return false;
    }

    private void quickSort(int[] arr, int start, int end) {
        if(start<end) {
            int pi = partition(start, end, arr);
            quickSort(arr, pi + 1, end);
            quickSort(arr, start, pi - 1);
        }
    }

    private int partition(int start, int end, int[] arr) {
        int pi = arr[end];
        int i = start;
        int j = i - 1;

        for (i = 0; i < end; i++) {
            if (arr[i] <= pi) {
                j = j + 1;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        if (arr[j + 1] > arr[end]) {
            int temp = arr[j + 1];
            arr[j + 1] = arr[end];
            arr[end] = temp;

        }

        return j + 1;
    }


}
