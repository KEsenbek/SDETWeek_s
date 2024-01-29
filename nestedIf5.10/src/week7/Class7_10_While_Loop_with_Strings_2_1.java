package week7;

import java.util.Scanner;

public class Class7_10_While_Loop_with_Strings_2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email address:");
        String answer = sc.nextLine();

        while (!(answer.endsWith("@domain.com"))) {
            System.out.println("Invalid input. Please enter a valid email address in the format of username@domain.com.");
            answer= sc.nextLine();
        }
        System.out.println("Valid input. Thank you!");

    }
}
