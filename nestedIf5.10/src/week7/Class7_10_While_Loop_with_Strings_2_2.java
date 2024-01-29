package week7;

import java.util.Scanner;

public class Class7_10_While_Loop_with_Strings_2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = sc.nextLine();

        while (name.trim().length()==0) {
            System.out.println("Invalid input. Please enter your name:");
            name = sc.nextLine();
        }
        System.out.println("Welcome, "+name+"!");
    }
}
