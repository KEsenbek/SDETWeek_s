package week7;

public class Class7_6_While_Loop_With_Strings_1_5 {
    public static void main(String[] args) {
        removeSpaces("NoSpacesHere ");
    }

    public static String removeSpaces(String spaces) {
        String result = "";
        int index = 0;
        while (index < spaces.length()) {
            char currentChar = spaces.charAt(index);
            if (currentChar != ' ') {
                result += currentChar;
            }
            index++;
        }
        return result;
    }
}
