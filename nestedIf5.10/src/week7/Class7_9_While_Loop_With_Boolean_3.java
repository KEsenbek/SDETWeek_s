package week7;

import java.util.Scanner;

public class Class7_9_While_Loop_With_Boolean_3 {
    public static void main(String[] args) {
        validatePasswordLength();
    }

    public static void validatePasswordLength() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a password:");
        String password = scanner.nextLine();
        while (password.length() <= 8) {
            System.out.println("Password must be more than 8 characters. Please try again:");
            password = scanner.nextLine();
        }
        System.out.println("Password is valid");
    }
}
