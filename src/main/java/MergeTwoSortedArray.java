public class MergeTwoSortedArray {
	public static void main(String args[]) {
		int arr1[] = {1,2,3,4,10,15};
		int arr2[] = {5,6,7,8,11};
		int arr3[]=new int[arr1.length+arr2.length];
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
		for (int i = 0; i < arr3.length-1; i++) {
			while (arr3[i] > arr3[i + 1]) {
				int temp = arr3[i];
				arr3[i] = arr3[i + 1];
				arr3[i + 1] = temp;
			}
		}

		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]);
		}
	}
}
