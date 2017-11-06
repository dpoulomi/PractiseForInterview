//An array contains n numbers ranging from 0 to n-1. There are some numbers duplicated in the
//array. It is not clear how many numbers are duplicated or how many times a number gets duplicated. How do you
//find a duplicated number in the array? For example, if an array of length 7 contains the numbers {2, 3, 1, 0, 2, 5,
//3}, the implemented function (or method) should return either 2 or 3.

public class MultipleDuplicateNumber {

	public static void main(String args[]) {

		int arr[] = { 2, 3, 1, 0, 4, 5, 7 ,6,5};
		MultipleDuplicateNumber far = new MultipleDuplicateNumber();
		int duplicateNumber = far.findDuplicate(arr);
		System.out.println(duplicateNumber);

	}

	private int findDuplicate(int[] arr) {
		int element = 0;
		for (int i = 0; i < arr.length; i++) {
			while (arr[i] != i) {
				if (arr[arr[i]] == arr[i]) {
					return arr[i];
				}
				int temp = arr[arr[i]];
				arr[arr[i]] = arr[i];
				arr[i] = temp;
			}

		}
		return element;
	}

}
