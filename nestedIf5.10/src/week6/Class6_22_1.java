package week6;

public class Class6_22_1 {
    //Write a static method called getLastIndexOfProgramming() that
    // takes a string as input and finds the index of the last occurrence of the substring "programming".
    //Params:
    //A string: the input string to search for the last occurrence of "programming"
    //Return:
    //An integer: the index of the last occurrence of "programming"
    // in the input string. If "programming" is not found in the input string, the method should return -1.
    public static void main(String[] args) {
        getLastIndexOfProgramming("I love programming, it's my passion! Let's learn programming together");
    }

    public static int getLastIndexOfProgramming(String text) {
        int num = text.lastIndexOf("programming");
        return num;
    }
}
