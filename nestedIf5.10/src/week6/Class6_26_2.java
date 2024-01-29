package week6;

public class Class6_26_2 {
    //Write a method called validateString() that uses the trim() and length() methods to validate a string.
    // The string is valid if it contains at least one character and does not
    // contain any whitespace at the edges of the sentence.
    //Params:
    //String: The string to be validated.
    //Return:
    //boolean: The method should return true or false indicating whether the string is valid or not.
    //Examples:
    //Input: "Hello World!"
    //Output: true
    //Input: " Hello World!"
    //Output: false

    public static void main(String[] args) {
        validateString(" Hello world!");
    }

    public static boolean validateString(String text) {

        int value1 = text.length();
        int value2 = text.trim().length();

        if (value1==value2){
            return true;
        }else {
            return false;
        }
    }
}
