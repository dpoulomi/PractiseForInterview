package whatnot;

public class NumberOfOccurencesInsortedArray {

    public static void main(String[] args) {
        int arr[] = {1,1,1,1,1,1,1,1,1,1, 2, 3, 3, 3, 3, 4, 5,5};
        int val = 1;
        NumberOfOccurencesInsortedArray numberOfOccurencesInsortedArray = new NumberOfOccurencesInsortedArray();
        numberOfOccurencesInsortedArray.findNumberOfOcuurenceOfTheElement(arr, val);
    }

    private void findNumberOfOcuurenceOfTheElement(int[] arr, int val) {
        int start = 0;
        int end = arr.length - 1;

        int index = binarySearch(start, end, arr, val);
        System.out.println(findElementInLeftAndRight(index,arr,val));

    }

    private int findElementInLeftAndRight(int index, int[] arr, int val) {
        int valIndex = index;
        int endpoint = 0;
        int startPoint = 0;

        while (index<arr.length && arr[index] == val) {
            index++;

        }
        endpoint = index;
        index = valIndex;
        while (index != 0 && arr[index] == val) {
            index--;
        }
        startPoint = index;
        return (endpoint-startPoint-1);
    }

    private int binarySearch(int start, int end, int[] arr, int val) {

        while(end>start) {
            int mid = (start + end) / 2;
            if (arr[mid] == val) {
                return mid;

            } else if (arr[mid] > val) {
                end = mid - 1;

            } else if (arr[mid] < val) {
                start = mid + 1;
            }
        }
        return -1;
    }

}
