package week6;

public class Class6_26_1 {

    //Exercise: Create a static method named removeWhitespaces()
    // that takes a string as input and removes all leading and trailing whitespaces.
    // The method should return the modified string.
    //Params: A string with leading and/or trailing whitespace.
    //Return: A string without any leading or trailing whitespace.

    public static void main(String[] args) {
        removeWhitespaces(" I like this  ");
    }

    public static String removeWhitespaces(String text) {
        return text.trim();
    }
}
