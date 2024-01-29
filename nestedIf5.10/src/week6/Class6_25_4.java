package week6;

public class Class6_25_4 {
    //Create a static method named convertTextCase()
    // that takes two parameters: String and char.
    // The String parameter represents the input sentence,
    // and the char parameter can have two values: 'L' or 'U',
    // indicating whether the text should be converted to lowercase
    // or uppercase, respectively. Your program should perform the
    // specified case conversion and return the transformed text as String.
    //
    //Example:
    public static void main(String[] args) {
        convertTextCase("CoMpUtEr ScIeNcE", 'U');
    }

    public static String  convertTextCase(String text, char value) {

        if (value == 'U') {
            return text.toUpperCase();
        }else if (value == 'L') {
            return text.toLowerCase();
        }else {
            return "-1";
        }
    }
}
