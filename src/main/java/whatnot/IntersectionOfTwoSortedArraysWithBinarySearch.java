package whatnot;

public class IntersectionOfTwoSortedArraysWithBinarySearch {

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 7, 10, 13};
        int[] arr2 = {1, 3, 5, 7, 9};
        IntersectionOfTwoSortedArraysWithBinarySearch intersectionOfTwoSortedArraysWithBinarySearch = new IntersectionOfTwoSortedArraysWithBinarySearch();
        intersectionOfTwoSortedArraysWithBinarySearch.findIntersection(arr1, arr2);

    }

    private void findIntersection(int[] arr1, int[] arr2) {
        for (int i = 0; i <= arr1.length-1; i++) {
            binarySearch(arr2, arr1[i],i);

        }

    }

    public void binarySearch(int[] arr, int element,int index) {
        int start =0;
        int end = arr.length;
       ;
        while (end >= start) {
            int mid = start +  (end - start) / 2;
            if (element==arr[mid]) {
                System.out.println(element);
                return;
            }else if(element>arr[mid]){
                start=mid+1;

            }else{
                end=mid-1;
            }
        }

    }
}
