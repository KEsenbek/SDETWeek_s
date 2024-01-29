package week9;

public class Class9_5_1_Combine_first_and_second_words_Data_Types_Of_Arrays {
    public static void main(String[] args) {
        combineWords(new String[]{"First", "Second", "Third", "Fourth"}, 4);
    }

    public static String combineWords(String[] arr, int num) {
        if (num <= 0) {
            return "N is not positive";
        } else if (arr == null || arr.length == 0 || arr[0] == null || arr[1] == null) {
            return "Array is empty";
        }

        int length1 = arr[0].length();
        int length2 = arr[1].length();
        if (length1 == length2) {
            return "Both are equal";
        }

        String returnString = "";
        if (length1 > length2) {
            for (int i = 0; i < num; i++) {
                returnString += arr[0];
            }
            returnString += arr[1];
        } else {
            for (int i = 0; i < num; i++) {
                returnString += arr[1];
            }
            returnString += arr[0];
        }
        return returnString;
    }
}
