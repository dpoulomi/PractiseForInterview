

public class Search2DMatrix {
	
	public static void main(String args[]){
		
		int matrix[][] = {{1,3,5},{7,9,11},{13,15,17}};
		int value=7;
		Search2DMatrix sm= new Search2DMatrix();
		boolean result=sm.find(matrix, value);
		System.out.println(result);
	}
	
	public boolean find(int matrix[][], int value) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		int start = 0;
		int end = rows * cols - 1;
		while (start <= end) {
		int mid = start + (end - start) / 2;
		int row = mid / cols;
		int col = mid % cols;
		int v = matrix[row][col];
		if (v == value)
		return true;
		if (v > value)
		end = mid - 1;
		else
		start = mid + 1;
		}
		return false;
		}
}
