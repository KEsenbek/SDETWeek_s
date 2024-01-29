package week9;

public class CLass9_17_4_Sum_of_Row_or_Column_Multi_Dimensional_Arrays {
    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        String rowOrColumn = "row";
        int index = 3;

        // Calculate and print the sum
        int result = calculateSum(matrix, rowOrColumn, index - 1); // Adjust index by 1 to match human-readable convention

        System.out.println(result);
    }

    public static int calculateSum(int[][] matrix, String type, int index) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;

        if (type.equals("row") && index >= 0 && index <= numRows) {
            int sum = 0;
            for (int col = 0; col < numCols; col++) {
                sum += matrix[index-1][col];
            }
            return sum;
        } else if (type.equals("column") && index >= 0 && index <= numCols) {
            int sum = 0;
            for (int row = 0; row < numRows; row++) {
                sum += matrix[row][index-1];
            }
            return sum;
        } else {
            return 0;
        }
    }
}
