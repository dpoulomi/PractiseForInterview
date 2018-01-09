package whatnot;/*
package com.home.zion.whatnot;

public class BInarySearch {

	public static void main(String args[]) {
		int arr[] = { 12, 4, 8, 10, 56, 1 };
		BInarySearch bs = new BInarySearch();
		int l = 0;
		int h = arr.length;
		int m = (l + h) / 2;
		int position = bs.binarySearch(arr, 8, l, h, m);
		System.out.println(position);
	}

	public int binarySearch(int arr[], int search, int l, int h, int m) {
		int low = l;
		int high = h;
		int mid = (low+high)/2;

		while (low < high) {
			if (arr[(mid)] == search) {
				return mid;
			}
			if (arr[(mid)] < search) {
				return	binarySearch(arr, search, mid, high, (mid + high) / 2);
			}
			if (arr[(mid)] > search) {Depth-First SearchDepth-First SearchDepth-First SearchDepth-First Searchpublic static void main(String args[]) {
				int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
				// int arr[] = { 6, 3, 1, 4, 8 };
				Quicksort rs = new Quicksort();
				rs.radixSort(arr);
			}public static void main(String args[]) {
				int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
				// int arr[] = { 6, 3, 1, 4, 8 };
				Quicksort rs = new Quicksort();
				rs.radixSort(arr);
			}HeapSortHeapSortHeapSortHeapSortHeapSort
				return	binarySearch(arr, search, low, mid, (low + mid) / 2);
			}
		}
		return 0;
	}

}
*/
