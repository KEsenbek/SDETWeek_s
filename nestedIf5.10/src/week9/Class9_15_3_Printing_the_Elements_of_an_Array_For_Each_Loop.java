package week9;

public class Class9_15_3_Printing_the_Elements_of_an_Array_For_Each_Loop {
    public static void main(String[] args) {
        printAllNumbersInArray(new int[]{1, 2, 3, 4, 5});
    }

    public static void printAllNumbersInArray(int[] nums) {

        for (int num : nums) {
            System.out.println(num);
        }
    }
}
