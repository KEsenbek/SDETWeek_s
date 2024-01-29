package week6;

public class Class6_24_4 {

    //Write a method called extractBoldSubstrings() that takes a string as input
    // and returns a string containing the bold substring in the input string.
    // Return the empty string if no bold text in the input string.
    //Params:
    //String: The string to be extracted.
    //Return:
    //String: A string containing the bold substring in the input string.
    //Examples:
    //Input:
    //This is **bold** text
    //Output:
    //bold
    //Input:
    //This is not *bold* text
    //Output:
    //""
    //Make sure that indexOf() and lastIndexOf() are not equal.
    // If they are equal, then ** occurs only 1 time in the String,
    // which means ** opens and does not close, then this is not a bold text.
    //In addition, this will serve as an additional check to see
    // if the text contains ** at all. If this is missing, then both indexOf() and lastIndexOf() will return -1 and be equal.
    public static void main(String[] args) {
        extractBoldSubstrings("This is not **bold** text");
    }

    public static String extractBoldSubstrings(String input) {
        // Check if the input contains the opening and closing markers for bold text
        int startIndex = input.indexOf("**");
        int endIndex = input.lastIndexOf("**");

        if (startIndex != -1 && endIndex != -1 && startIndex != endIndex) {
            // Extract and return the bold substring
            return input.substring(startIndex + 2, endIndex);
        } else {
            // No bold text found
            return "";
        }
    }
}
