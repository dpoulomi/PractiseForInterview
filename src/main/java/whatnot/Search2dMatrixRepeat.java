package whatnot;

/*In a 2-D matrix, every row is increasingly sorted from left to right, and every column is
increasingly sorted from top to bottom. Please implement a function to check whether a number is in such a
matrix or not. For example, all rows and columns are increasingly sorted in the following matrix. It returns true if it
tries to find number 7, but it returns false if it tries to find number 5.
1 2 8 9
2 4 9 12
4 7 10 13
6 8 11 15*/
public class Search2dMatrixRepeat {

	public static void main(String args[]) {

		int element = 4;
		int arr[][] = { { 1, 2, 8, 9 }, { 2, 4, 9, 12 },{4, 7, 10, 13} ,{ 6, 8, 11, 15 } };
		int rows = arr.length;
		int cols = arr[0].length;
		int start = 0;
		int end = rows-1 ;
		Search2dMatrixRepeat ar2d = new Search2dMatrixRepeat();
		boolean elementPresent = ar2d.searchElement(element, arr, rows, cols,
				start, end);
		System.out.println(elementPresent);
	}

	private boolean searchElement(int element, int[][] arr, int rows, int cols,
			int start, int end) {
		for(int i=0;i<=cols;i++){
			 start = 0;
			 end = rows - 1;
		while (end >=start) {
			int mid = start +(end - start) / 2;
			int v=arr[i][mid];
			if (v == element) {
				return true;
			}
			if (v > element) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}

		}
	}
		return false;
	}

}
