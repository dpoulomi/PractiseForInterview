package whatnot;

public class Search2DMatrixUnsorted {

	public static void main(String args[]) {

		int matrix[][] = { { 1, 2, 8, 9 }, { 2, 4, 9, 12 }, { 5, 7, 10, 13 },
				{ 6, 8, 11, 15 } };
		int value = 4;
		Search2DMatrixUnsorted sm = new Search2DMatrixUnsorted();
		boolean result = sm.find(matrix, value);
		System.out.println(result);
	}

	private boolean find(int[][] matrix, int value) {
		int rows = matrix.length;
		int cols = matrix[0].length;

		for (int i = 0; i < cols; i++) {
			int start = 0;
			int end = rows - 1;
			while (end >= start) {
				int mid = start + (end - start) / 2;
				int v = matrix[i][mid];
				if (v == value) {
					return true;
				}

				if (v > value) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return false;
	}
}
