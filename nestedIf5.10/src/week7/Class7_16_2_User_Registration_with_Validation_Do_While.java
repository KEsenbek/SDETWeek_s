package week7;

import java.util.Scanner;

public class Class7_16_2_User_Registration_with_Validation_Do_While {
    public static void main(String[] args) {
        validatePassword();
    }

    public static void validatePassword() {
        Scanner sc = new Scanner(System.in);
        String password;
    do {

        System.out.println("Enter a password:");
        password = sc.nextLine();

        if (password.length() >= 8) {
            System.out.println("Registration successful!");
        } else {
            System.out.println("Password must be at least 8 characters long.");
        }
    }
        while (!(password.length() >=8));
    }
}
