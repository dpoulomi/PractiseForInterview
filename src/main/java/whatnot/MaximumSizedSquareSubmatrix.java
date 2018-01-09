package whatnot;

public class MaximumSizedSquareSubmatrix {

    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 1, 0, 1}, {1, 1, 0, 1, 0}, {0, 1, 1, 1, 0}, {1, 1, 1, 1, 0}, {1, 1, 1, 1, 1}, {0, 0, 0, 0, 0}};
        MaximumSizedSquareSubmatrix maximumSizedSquareSubmatrix = new MaximumSizedSquareSubmatrix();
        maximumSizedSquareSubmatrix.getSizeofMaximumSizedSquareSubmatrix(matrix);
    }

    private void getSizeofMaximumSizedSquareSubmatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int i = 0;
        int j = 0;
        int[][] auxilary = new int[rows][cols];
        for (i = 0; i < rows; i++) {
            for (j = 0; j < cols; j++) {
                if (i == 0 || j == 0) {
int element=matrix[i][j];
                    auxilary[i][j] = element;
                } else if (matrix[i][j] == 0) {
                    auxilary[i][j] = 0;
                }

            }

        }
        for (i = 0; i < rows; i++) {
            for (j = 0; j < cols; j++) {
                if (auxilary[i][j] != matrix[i][j]) {
                    auxilary[i][j] = Math.min(matrix[i - 1][j - 1], Math.min(matrix[i - 1][j], matrix[i][j - 1]));

                }


            }

        }
        int max_i = 0;
        int max_j = 0;
        int max = auxilary[0][0];
        for (i = 0; i < auxilary.length; i++) {
            for (j = 0; j < cols; j++) {
                if (auxilary[i][j] > max) {
                    max = auxilary[i][j];
                    max_i = i;
                    max_j = j;
                }
            }
        }

        for (i = max_i; i < max_i - max; i--) {
            for (j = max_j; j < max_j - max; j--) {
                System.out.println(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
