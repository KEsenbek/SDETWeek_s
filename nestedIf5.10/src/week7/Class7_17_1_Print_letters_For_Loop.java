package week7;

import java.util.Scanner;

public class Class7_17_1_Print_letters_For_Loop {
    public static void main(String[] args) {
        String letters = "abcdefghijklmnopqrstuvwxyz";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        String answer = "";
        if (number < 26 && number>=0) {
            for (int i = 0; i < number; ) {
                // System.out.print(letters.charAt(i++));
                answer += letters.charAt(i++);

            }
            System.out.println("Result: " + answer);
        } else {
            System.out.println("Result: Error! Invalid number");
        }
    }
}
