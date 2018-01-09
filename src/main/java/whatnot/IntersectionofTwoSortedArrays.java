package whatnot;

public class IntersectionofTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 7, 10, 13};
        int[] arr2 = {1, 3, 5, 7, 9};
        IntersectionofTwoSortedArrays intersectionofTwoSortedArrays = new IntersectionofTwoSortedArrays();
        intersectionofTwoSortedArrays.getIntersectionArrays(arr1, arr2);
    }

    private void getIntersectionArrays(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int i = 0;
        int j = 0;

        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {

                i++;

            } else if (arr2[j] < arr1[i]) {
                j++;
            } else {
                System.out.println(arr2[j]);
                j++;
                i++;
            }
        }
    }

}