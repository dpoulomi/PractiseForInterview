package whatnot;

public class RadixSOrt {
	public static void main(String args[]) {
		int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
		// int arr[] = { 6, 3, 1, 4, 8 };
		RadixSOrt rs = new RadixSOrt();
		rs.radixSort(arr);
	}

	private void radixSort(int[] arr) {
		int count = maxDigitCount(arr);
		while (count != 0) {
			if (count == 3) {
				getUnitsPlace(arr);
			}
			if (count == 2) {
				getTensPlace(arr);
			}
			if (count == 1) {
				getHundredsPlace(arr);
			}
			count--;
		}
		for (int ele : arr) {
			System.out.println(ele);
		}
	}

	public void getHundredsPlace(int[] arr) {
		int digit = 0;
		int divider = 100;
		for (int i = 0; i < arr.length; i++) {
			digit = (arr[i] / divider);
			if (i != 0) {
				if ((arr[i] / divider) < (arr[i - 1] / divider)) {
					if (i != 0) {
						while (i != 0 && digit < (arr[i - 1] / divider)) {
							int temp = arr[i];
							arr[i] = arr[i - 1];
							arr[i - 1] = temp;
							i--;
						}
						digit = arr[i] / divider;
					}
				}
			}
		}

	}

	public void getUnitsPlace(int[] arr) {
		int integerPosition = 10;
		int digit = 0;
		int divider = 1;
		for (int i = 0; i < arr.length - 1; i++) {
			digit = (arr[i] / divider) % integerPosition;
			if (i != 0) {
				if ((arr[i] / divider) % integerPosition < (arr[i - 1] / divider)
						% integerPosition) {
					if (i != 0) {
						while (digit < (arr[i - 1] / divider) % integerPosition) {
							int temp = arr[i];
							arr[i] = arr[i - 1];
							arr[i - 1] = temp;
							i--;
						}
						digit = arr[i] % integerPosition;
					}
				}
			}
		}
	}

	public void getTensPlace(int[] arr) {
		int divider = 10;
		int integerPosition = 10;
		for (int i = 0; i < arr.length; i++) {
			int digit = (arr[i] / divider) % integerPosition;
			if (i != 0) {
				if ((arr[i] / divider) % integerPosition < (arr[i - 1] / divider)
						% integerPosition) {
					if (i != 0) {
						while (i != 0
								&& digit < (arr[i - 1] / divider)
										% integerPosition) {
							int temp = arr[i];
							arr[i] = arr[i - 1];
							arr[i - 1] = temp;
							i--;
						}
						digit = (arr[i] / divider) % integerPosition;
					}
				}
			}
		}

	}

	public int maxDigitCount(int[] arr) {
		String s = Integer.valueOf(arr[0]).toString();
		for (int i = 0; i < arr.length - 1; i++) {
			if (s.length() < Integer.valueOf(arr[i]).toString().length()) {
				s = Integer.valueOf(arr[i]).toString();
			}
		}
		return s.length();

	}
}
