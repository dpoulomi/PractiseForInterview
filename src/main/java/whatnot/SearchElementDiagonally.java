package whatnot;

public class SearchElementDiagonally {

	public static void main(String args[]) {

		int matrix[][] = { { 1, 2, 8, 9 }, { 2, 4, 9, 12 }, { 5, 7, 10, 13 },
				{ 6, 8, 11, 15 } };
		int value = 7;
		SearchElementDiagonally sm = new SearchElementDiagonally();
		boolean result = sm.find(matrix, value);
		System.out.println(result);
	}

	private boolean find(int[][] matrix, int value) {
		int rows=matrix.length;
		int cols=matrix[0].length;
		int i=0;
		int j=0;
		int col=0;
		while(i!=rows && j!=cols){
			int temp=matrix[i][j];
			if(matrix[i][j]==value){
				return true;
				
			}
			if(matrix[i][j]>temp && matrix[i][j]<value ){
				temp=matrix[i][j];
			}
			
			
			
			i++;
			j++;
			
		}
		//while(col<=j && row<=)
		
		return false;
	}
}
