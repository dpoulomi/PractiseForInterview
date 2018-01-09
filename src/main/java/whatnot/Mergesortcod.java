package whatnot;

import java.util.ArrayList;

public class Mergesortcod {
	public static void main(String args[]) {

		/*int arr1[] = { 1, 7, 9, 10 };
		int arr2[] = { 2, 5, 6, 8 };
		*/
		int arr1[] = { 1, 7, 9, 10,11,20 };
		int arr2[] = { 2, 5, 6, 8, 19 };
		Mergesortcod mg = new Mergesortcod();
		mg.merge(arr1, arr2);
	}

	public void merge(int arr1[], int arr2[]) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		int i = 0;
		int j = 0;
		int count = arr1.length;
		int count1 = arr2.length;
		while (i < count || j < count1) {
			if (i < count && j < count1) {
				if (arr1[i] < arr2[j]) {
					l1.add(arr1[i]);
					if (i < arr1.length) {
						i++;
					}
				} else {
					l1.add(arr2[j]);
					if (j < arr2.length) {
						j++;
					}
				}
			} else {
				if (i < count && !(j < count1)) {
					l1.add(arr1[i]);
					if (i < arr1.length) {
						i++;
					}
				} else {
					l1.add(arr2[j]);
					if (j < arr2.length) {
						j++;
					}

				}

			}
		}
		for (int ele : l1) {
			System.out.println(ele);
		}
	}
}
