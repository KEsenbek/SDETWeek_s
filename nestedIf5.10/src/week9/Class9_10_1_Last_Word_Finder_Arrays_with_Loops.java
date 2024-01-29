package week9;

public class Class9_10_1_Last_Word_Finder_Arrays_with_Loops {
    public static void main(String[] args) {
        findLastWord("Today is a good day");
    }

    public static String findLastWord(String text) {
        if (text.isEmpty()) {
            return "No words found.";
        }
        int index = text.lastIndexOf(' ');

        return text.substring(index+1);
    }

}
