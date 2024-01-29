package week6;

public class Class6_25_2 {
    //Write a static method called convertToUpperCase()
    // that reads a sentence from the user and converts all letters to uppercase.
    public static void main(String[] args) {
        convertToUpperCase("i like to move it");
    }

    public static String convertToUpperCase(String text) {
        return text.toUpperCase();
    }
}
