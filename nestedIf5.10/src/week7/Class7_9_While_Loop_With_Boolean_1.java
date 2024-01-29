package week7;

import java.util.Scanner;

public class Class7_9_While_Loop_With_Boolean_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The ticket fine is $100.00");
        System.out.println("Do you want to double the ticket fine?");
        boolean answer = sc.nextBoolean();
        double i = 200;
        while (answer) {
            System.out.printf("The ticket fine is $%.2f\n",i);
            System.out.println("Do you want to double the ticket fine?");
            answer = sc.nextBoolean();
            i+=i;
        }
    }
}
