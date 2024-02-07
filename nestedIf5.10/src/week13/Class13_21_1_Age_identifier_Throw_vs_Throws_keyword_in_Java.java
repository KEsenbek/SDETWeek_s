package week13;

import java.util.Scanner;

public class Class13_21_1_Age_identifier_Throw_vs_Throws_keyword_in_Java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AgeVerifier ageVerifier = new AgeVerifier();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        try {
            ageVerifier.verifyAge(age);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class AgeVerifier {
    static void verifyAge(int age) throws IllegalArgumentException {
        if (age<0) {
            throw new IllegalArgumentException("Age cannot be negative");
        } else if (age<18) {
            throw new IllegalArgumentException("Age must be at least 18");
        } else {
            System.out.println("Age verification successful");
        }
    }
}