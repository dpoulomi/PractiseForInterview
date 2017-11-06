
public class SelectionSort {
	public static void main(String args[]) {
		 int arr[] = { 12,17,1, 5, 16};
		//int arr[] = { 6, 3, 1, 4, 8 };
		SelectionSort ss = new SelectionSort();
		ss.select(arr);
	}

	int count = 0;

	private void select(int[] arr) {
		int least = 0;
		int count = 0;
		int i = 0;
		int position = 0;
		
		while (count < arr.length) {
			least = arr[count];
			position=count;
			for (i = count; i < arr.length; i++) {
				if (arr[i] < least) {
					least = arr[i];
					position = i;
				}
			}
			int j = position;
			while (j > count) {
				if (j != 0) {
					arr[j] = arr[j - 1];
					arr[j - 1] = least;
					j--;
				}

			}
			count++;
		}

		for (int ele : arr) {
			System.out.println(ele);
		}
	}
}
