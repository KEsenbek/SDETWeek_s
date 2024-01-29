package week6;

import java.util.Scanner;

public class Class6_5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        welcomeMessage(name);
    }

    public static void welcomeMessage(String var){
        System.out.printf("Welcome to %s, your home to level up your entire game!", var);
    }
}
