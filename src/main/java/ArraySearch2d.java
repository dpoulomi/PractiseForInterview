/*In a 2-D matrix, every row is increasingly sorted from left to right, and the last number in each
 row is not greater than the first number of the next row. A sample matrix follows. Please implement a function to
 check whether a number is in such a matrix or not. It returns true if it tries to find the number 7 in the sample
 matrix, but it returns false if it tries to find the number 12.
 1 3 5
 7 9 11
 13 15 17*/
public class ArraySearch2d {

	public static void main(String args[]) {

		int element = 7;
		int arr[][] = { { 1, 3, 5 }, { 7, 9, 11 }, { 13, 15, 17 } };
		int rows = arr.length;
		int cols = arr[0].length;
		int start = 0;
		int end = rows * cols - 1;
		ArraySearch2d ar2d = new ArraySearch2d();
		boolean elementPresent = ar2d.searchElement(element, arr, rows, cols,
				start, end);
		System.out.println(elementPresent);
	}

	private boolean searchElement(int element, int[][] arr, int rows, int cols,
			int start, int end) {

		while (end >= start) {
			int mid = start + (end - start)/2;
			int row = mid / rows;
			int col = mid % cols;
			int v = arr[row][col];

			if (v == element) {
				return true;
			}
			if (v > element) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}

		}
		return false;

	}
}
