package week7;

import java.util.Scanner;

public class Class7_11_While_Loop_Counter_2 {
    public static void main(String[] args) {
        countCharOccurrences("Hello", 'l');
    }

    public static int countCharOccurrences(String input, char input1) {
        int wordLength = input.length();
        int counter = 0;
        int index = 0;
        while (index < wordLength) {
            if (input.charAt(index) == input1) {
                counter++;
            }
            index++;
        }
        if (counter == 0) {
            return -1;
        } else {
            return counter;
        }
    }
}
