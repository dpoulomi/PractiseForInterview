package whatnot;

public class PrintMatrixInSpiralForm {

    public static void main(String[] args) {
        PrintMatrixInSpiralForm printMatrixInSpiralForm = new PrintMatrixInSpiralForm();
        int arr[][] = {{1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18}
        };
        int m = arr.length - 1;
        int n = arr[0].length - 1;
        printMatrixInSpiralForm.printInSprialForm(arr, m, n);
    }

    private void printInSprialForm(int[][] arr, int m, int n) {
        int i;
        int k = 0;
        int l = 0;
        while (k <= m && l <= n) {
            for (i = l; i <= n; i++) {
                System.out.print(arr[k][i] + " ");
            }
            k++;
            for (i = k; i <= m; i++) {
                System.out.print(arr[i][n] + " ");
            }
            n--;
            if(k<m) {
                for (i = n; i >= l; i--) {
                    System.out.print(arr[m][i] + " ");
                }
                m--;
            }
            if(l<n) {
                for (i = m; i >= k; i--) {
                    System.out.print(arr[i][l] + " ");
                }
                l++;
            }
        }
    }
}
