package week9;

public class Class9_6_1_Print_Values_Until_Index_Inclusively_Arrays_with_Loops {
    public static void main(String[] args) {
        printValuesUntilIndex(new int[]{1, 2, 3, 4, 5}, 8);
    }

    public static void printValuesUntilIndex(int[] ints, int index) {
        if (index < 0 || index > ints.length) {
            System.out.println("Index out of bounds");

        } else {

            for (int i = 0; i <= index; i++) {
                System.out.println(ints[i]);
            }

        }
    }
}
