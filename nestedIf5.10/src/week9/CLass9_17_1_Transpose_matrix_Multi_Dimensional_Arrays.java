package week9;

import java.util.Arrays;

public class CLass9_17_1_Transpose_matrix_Multi_Dimensional_Arrays {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

         int[][] transposedMatrix = transposeMatrix(matrix);

    // Print the transposed matrix
        for (int i = 0; i < transposedMatrix.length; i++) {
        for (int j = 0; j < transposedMatrix[0].length; j++) {
            System.out.print(transposedMatrix[i][j] + " ");
        }
        System.out.println();
    }
}

        public static int[][] transposeMatrix(int[][] matrix) {
            // Check if the matrix is empty or not square
            if (matrix == null || matrix.length == 0 || matrix.length != matrix[0].length) {
                return new int[0][0];
            }

            int rows = matrix.length;
            int columns = matrix[0].length;

            // Create a new matrix to store the transposed values
            int[][] transposedMatrix = new int[columns][rows];

            // Transpose the matrix
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    transposedMatrix[j][i] = matrix[i][j];
                }
            }

            return transposedMatrix;
        }
}
