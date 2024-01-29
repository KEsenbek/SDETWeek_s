package week6;

public class Class6_22_4 {
//Write a method called findSubstringIndex() that takes a string and a substring as input and
// returns the index of the first occurrence of the substring in the string, ignoring case.
//Params:
//String input: The string to be searched.
//String substring: The substring to be found.
//Return:
//int: The index of the first occurrence of the substring in the string, ignoring case, or -1 if the substring is not found.
//Examples:
//Input:
//input = "Hello World!"
//subsequence = "world"
//Output:
//6
public static void main(String[] args) {
    findSubstringIndex("Hello World!", "world");
}

    public static int findSubstringIndex(String text, String subsequence) {

    int num = text.toLowerCase().indexOf(subsequence.toLowerCase());
    return num;
    }
}
