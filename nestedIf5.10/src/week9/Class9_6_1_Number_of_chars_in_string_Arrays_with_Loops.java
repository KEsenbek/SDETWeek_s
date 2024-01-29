package week9;

public class Class9_6_1_Number_of_chars_in_string_Arrays_with_Loops {
    public static void main(String[] args) {
        countChar(new String[]{"hello", "world", "how", "are", "you"},'o');
    }

    public static int[] countChar(String[] stringArray, char ch) {
        if (stringArray == null || stringArray.length == 0) {
            // Return an array with values -1 if the string array is empty
            return new int[]{-1};
        }

        int[] countArray = new int[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {
            String currentString = stringArray[i];

            int count = 0;
            for (int j = 0; j < currentString.length(); j++) {
                if (currentString.charAt(j) == ch) {
                    count++;
                }
            }

            countArray[i] = count;
        }

        return countArray;
    }

}
