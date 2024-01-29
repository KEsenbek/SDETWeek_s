package week7;

import java.util.Scanner;

public class Class7_12_2_Typing_a_Password {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String enteredPassword = "";
            boolean isAuthenticated = false;
            while (!isAuthenticated) {
                System.out.println("Enter your password:");
                enteredPassword = scanner.nextLine();

                switch (enteredPassword) {
                    case "WEDEVX":
                        System.out.println("Correct password. Welcome!");
                        isAuthenticated = true;
                        break;
                    default:
                        System.out.println("Incorrect password. Try again.");
                        System.out.println("");
                }
            }
        }
    }