package week7;

public class Class7_22_1_Remainder_is_3_Break {
    public static void main(String[] args) {
        findRemainder(10);
    }
    public static int findRemainder(int givenNumber) {
        // Iterate from 1 to the given number
        for (int i = 1; i <= givenNumber; i++) {
            // Check if the remainder after dividing the given number by the current loop counter is 3
            if (givenNumber % i == 3) {
                return i; // Return the first number where the remainder is 3

            }
        }

        // If no such number is found, return 1
        return 1;
    }
}
