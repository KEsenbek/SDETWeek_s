package week7;

import java.util.Scanner;

public class Class7_14_1_Positive_Number_Validate_Do_While {
    public static void main(String[] args) {
        validateInput();
    }

    public static void validateInput() {
        Scanner scanner = new Scanner(System.in);
        int value;
        boolean firstAttempt = true;
        do {
            if (firstAttempt) {
                System.out.println("Enter a positive integer: ");
            } else {
                System.out.println("Error: Please enter a positive integer.");
            }
            value = scanner.nextInt();
            firstAttempt = false;
            if (value <= 0) {
                scanner.nextLine();
            } else {
                System.out.println("Valid number: " + value);
            }
        } while (value <= 0);
    }
}
