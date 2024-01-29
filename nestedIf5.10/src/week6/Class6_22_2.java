package week6;

public class Class6_22_2 {
    //Description: Your task is to write a static method called findJavaIndex()
    // that takes in a string as input and then finds the index of the first o
    // ccurrence of the substring "Java". The method should return the index
    // of the first occurrence of "Java" if it exists in the input string or -1 if it does not.
    //Param:
    //A string: The input string in which to find the index of the first occurrence of "Java".
    //Return:
    //An integer: The index of the first occurrence of "Java" in the input string, or -1 if it does not exist.
    public static void main(String[] args) {
        findJavaIndex("This is a Java program, welcome to Java Program");
    }

    public static int findJavaIndex(String text) {
        int num = text.indexOf("Java");
        return num;
    }
}
