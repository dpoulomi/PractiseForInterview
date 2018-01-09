package whatnot;

public class BubbleSort {

	public static void main(String args[]) {
		int arr[] = { 6, 7, 12, 4, 11, 51, 13, 41 };
		BubbleSort bs = new BubbleSort();
		bs.bubbleSort(arr);
		bs.printArray(arr);

	}

	private void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	private void bubbleSort(int[] arr) {
		for (int j = 0; j < arr.length - 1; j++) {
			for (int i = 0; i < arr.length -1; i++) {
				if (arr[i + 1] < arr[i]) {
					int temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;

				}

			}

		}
	}

}
