
public class Search2DMatrixPartiallySorted {

	public static void main(String args[]) {

		int matrix[][] = { { 1, 2, 8, 9 }, { 2, 4, 9, 12 }, { 5, 7, 10, 13 },
				{ 6, 8, 11, 15 } };
		int value = 5;
		Search2DMatrixPartiallySorted sm = new Search2DMatrixPartiallySorted();
		boolean result = sm.find(matrix, value);
		System.out.println(result);
	}
}
