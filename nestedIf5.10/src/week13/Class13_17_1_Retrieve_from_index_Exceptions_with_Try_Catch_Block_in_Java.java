package week13;

public class Class13_17_1_Retrieve_from_index_Exceptions_with_Try_Catch_Block_in_Java {
    public static void main(String[] args) {
          boolean ans =  retrieveElement(new boolean[]{true},0);
        System.out.println(ans);
    }
    public static boolean retrieveElement(boolean[] arrays, int index) {
        boolean indexOfArray = false;
        try {
            for (int i = index; i>=arrays.length; i++) {
                indexOfArray = arrays[i];
            }
            return indexOfArray;
        }catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Error: Index out of bounds.");
            return indexOfArray;
        }

    }
}
