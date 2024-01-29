package week7;

import java.util.Scanner;

public class Class7_9_While_Loop_With_Boolean_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("I'm building my bright future with WeDevX");
        System.out.println("Do you want to see this message again? (true/false)");
        boolean answer = sc.nextBoolean();

        while(answer) {
            System.out.println("I'm building my bright future with WeDevX");
            System.out.println("Do you want to see this message again? (true/false)");
            answer = sc.nextBoolean();
        }
    }
}
