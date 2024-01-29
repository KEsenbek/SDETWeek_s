package week7;

import java.util.Scanner;

public class Class7_13_2_Password_Guessing_Game_Do_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ourPass = "wedevx2023";
        String userPass = "";
        System.out.println("Welcome to the Password Guessing Game!");
        do {
            System.out.println("Guess the password:");
            userPass = sc.nextLine();

            if (userPass.equals(ourPass)) {
                System.out.println("Congratulations! You guessed the correct password.");
                break;
            }else if (userPass.equals("quit")) {
                System.out.println("Exiting the game.");
                break;
            }else {
                System.out.println("Incorrect password. Try again or type \"quit\" to exit.\n");
            }
        }while (true);
    }
}
