package week8;

public class Class8_5_3_Multiplication_Table_Sum_ForLoop {
    public static void main(String[] args) {
        calculateSumInTable(3,4);
    }

    public static int calculateSumInTable(int row, int column) {
        // Check for invalid input
        if (row < 1 || row > 15 || column < 1 || column > 15) {
            return -1; // Invalid input
        }
        int sum = 0;
        // Calculate sum of the specified row and column
        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= column; j++) {
                sum += i * j;
            }
        }
        return sum;
    }
}
