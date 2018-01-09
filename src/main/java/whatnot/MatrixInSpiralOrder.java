package whatnot;



public class MatrixInSpiralOrder {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        MatrixInSpiralOrder matrixInSpiralOrder = new MatrixInSpiralOrder();
        int rows = arr.length;
        int cols = arr[0].length;
        int start = 0;
        while (cols > start * 2 && rows > start * 2) {
            matrixInSpiralOrder.printSprialMatrix(arr, start);
            start++;
        }
    }

    private void printSprialMatrix(int[][] numbers, int start) {
        int rows = numbers.length;
        int cols = numbers[0].length;
        int endX = cols - 1 - start;
        int endY = rows - 1 - start;

        for(int i = start; i <= endX; ++i) {
            int number = numbers[start][i];
            System.out.println(number);
        }

        if(start < endY) {
            for(int i = start + 1; i <= endY; ++i) {
                int number = numbers[i][endX];
                System.out.println(number);
            }
        }
        // print a row from right to left
        if(start < endX && start < endY) {
            for(int i = endX - 1; i >= start; --i) {
                int number = numbers[endY][i];
                System.out.println(number);
            }
        }
        // print a column bottom up
        if(start < endX && start < endY - 1) {
            for(int i = endY - 1; i >= start + 1; --i) {
                int number = numbers[i][start];
                System.out.println(number);
            }
        }

    }
}
