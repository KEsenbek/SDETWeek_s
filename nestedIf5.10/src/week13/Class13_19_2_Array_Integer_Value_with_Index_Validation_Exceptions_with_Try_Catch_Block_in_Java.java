package week13;

public class Class13_19_2_Array_Integer_Value_with_Index_Validation_Exceptions_with_Try_Catch_Block_in_Java {
    public static void main(String[] args) {
        int[] arr2 = null;
        findValueAtIndex(arr2, 0);
    }

    public static void findValueAtIndex(int[] array, int index) {
        try {
            int[] nums = array;
            int element = nums[index];

            System.out.println(element);
        }catch (NullPointerException ex) {
            System.out.println("Array is null: Please provide a non-null array");
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: Please enter a valid index");
        }
    }
}
