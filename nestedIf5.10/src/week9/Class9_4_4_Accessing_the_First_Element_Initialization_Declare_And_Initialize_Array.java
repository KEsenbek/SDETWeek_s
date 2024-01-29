package week9;

public class Class9_4_4_Accessing_the_First_Element_Initialization_Declare_And_Initialize_Array {
    public static void main(String[] args) {
        printFirstElement(new int[]{1, 2, 3, 4, 5});
    }

    public static int printFirstElement(int[] arr) {

        if (arr[0] > 0) {
            return arr[0];
        } else {
            return 0;
        }
    }
}
