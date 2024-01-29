package week7;

import java.util.Scanner;

public class Class7_13_1_Guessing_a_Number_Do_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int numCorrect = 7;

        do {
            System.out.println("Enter a number:");
            a = sc.nextInt();
            if (a != numCorrect) {
                System.out.println("Incorrect. Try again.");
            }
        }while (a != numCorrect);
        System.out.println("Correct!");
    }
}
