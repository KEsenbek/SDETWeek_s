package week7;

public class Class7_18_2_Row_Sum_by_Index_For_Loop {
    public static void main(String[] args) {
        calculateRowSum(3);
    }
    public static int calculateRowSum(int row) {
        // Check if the provided row is within the valid range (1 to 12)
        if (row < 1 || row > 12) {
            return -1; // Invalid input
        }

        // Initialize a variable sum to 0 to keep track of the sum
        int sum = 0;

        // Use a loop to iterate through columns from 1 to 12
        for (int col = 1; col <= 12; col++) {
            // For each column, calculate the product of the row and the column and add it to the sum
            sum += row * col;
        }

        // Return the sum as the result
        return sum;
    }
}

