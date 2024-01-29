package week9;

public class CLass9_17_3_Accessing_an_Element_in_a_2D_Array_Multi_Dimensional_Arrays {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int row = 2;
        int column = 1;

        // Print the specified element
       // accessElement2D(array, row - 1, column - 1);
    }

    public static int accessElement2D(int[][] array, int row, int column) {
        // Check if the specified row and column are within the bounds of the array
        if (row >= 0 && row < array.length && column >= 0 && column < array[row].length) {
            // Print the element at the specified row and column
            return array[row - 1][column - 1];
        } else {
            return -1;
        }
    }
}

