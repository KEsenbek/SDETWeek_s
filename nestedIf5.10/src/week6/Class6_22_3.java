package week6;

import java.util.Scanner;

public class Class6_22_3 {
    //Write a method called findSubsequenceIndex() that takes a string,
    // a subsequence, and a starting index as input and returns the index
    // of the first occurrence of the subsequence in the string starting at the specified index.
    //Params:
    //String input: The string to be searched.
    //String subsequence: The subsequence to be found.
    //int startIndex: The starting index of the search.
    //Return:
    //int: The index of the first occurrence of the subsequence in
    // the string starting at the specified index, or -1 if the subsequence is not found.
    //Examples:
    //Input:
    //input = "Hello World!"
    //subsequence = "l"
    //startIndex = 5
    //Output:
    //9

    public static void main(String[] args) {
        int val = findSubsequenceIndex("Hello World", "l", 5);
        System.out.println(val);
    }

    public static int findSubsequenceIndex(String value, String subsequence, int startIndex) {
        int num = value.indexOf(subsequence, startIndex);
        return num;
    }
}
