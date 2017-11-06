public class InsertionSort {

	public static void main(String args[]) {
		// int arr[] = { 12,17,1, 5, 16};
		int arr[] = { 6, 3, 1, 4, 8 };
		InsertionSort is = new InsertionSort();
		is.insert(arr);
	}

	private void insert(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int pivot = arr[i];
			if (i != 0) {
				while (pivot < arr[i - 1]) {
					if (i != 0) {
						int temp = pivot;
						arr[i] = arr[i - 1];
						arr[i - 1] = temp;
						i--;
						if (i == 0) {
							break;
						}
					}
				}
			}

		}
		for (int ele : arr) {
			System.out.println(ele);
		}

	}
}
