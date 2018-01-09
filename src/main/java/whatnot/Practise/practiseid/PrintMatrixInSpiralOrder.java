package whatnot.Practise.practiseid;

/*Please print a matrix in spiral order, clockwise from outer rings to inner rings. For example, the
matrix below is printed in the sequence of 1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10.
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16*/
public class PrintMatrixInSpiralOrder {

	public static void main(String args[]){
		//int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int arr[][]={{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18}};
		int rows=arr.length;
		int cols=arr[0].length;
		PrintMatrixInSpiralOrder prm=new PrintMatrixInSpiralOrder();
		prm.printMatrixInSpriralOrder(arr,rows, cols);
	}

	private void printMatrixInSpriralOrder(int[][] arr, int rows, int cols) {
		int start=0;
		int i=0;
		int j=0;
		while(start<rows){
			i=start;
			j=i;
		while(i==start && j<=cols-1){
			
			System.out.println(arr[i][j]);
			j++;
		}
		j=j-1;
		i=i+1;
		while(j==cols-1 && i<=rows-1){
			System.out.println(arr[i][j]);
			i++;
		}
		i=i-1;
		j=j-1;
		while(i==rows-1 && j>=start){
			System.out.println(arr[i][j]);
			j--;
		}
		j=j+1;
		i=i-1;
		while(i>=start+1 && j==start){
			System.out.println(arr[i][j]);
			i--;
		}
		start++;
		cols--;
		rows--;
		}
	}
}
