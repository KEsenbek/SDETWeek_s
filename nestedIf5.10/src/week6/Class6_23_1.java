package week6;

public class Class6_23_1 {

    public static void main(String[] args) {
        removeSubstring("I like to code like a boss" , "o");
    }

    public static String removeSubstring(String sentence, String substring) {

        String result = sentence.replaceAll(substring, "");
        return  result;
    }
}
