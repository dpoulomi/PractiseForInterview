package whatnot;

public class NextLargeElement {

    public static void main(String[] args) {
        // int arr[] = {1, 3, 2, 4};
        int arr[] = {4, 3, 2, 1};
        NextLargeElement nextLargeElement = new NextLargeElement();
        nextLargeElement.findNextLargeElement(arr);
    }

    private void findNextLargeElement(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int j = i + 1;
            while (j < arr.length && arr[j] < arr[i]) {
                j++;

            }
            if (j >= (arr.length - 1)) {
                System.out.println(-1);
            } else {
                System.out.println(arr[j]);
            }
        }
    }
}
