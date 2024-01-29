package week7;

import java.util.Scanner;

public class Class7_22_2_Calculator_with_Break_Break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double firstNum;
        double secondNum;
        double sum =0;
        char symbol;
        do {
        System.out.println("Enter a mathematical operation (+, -, *, /) or type \"q\" to quit:");

        symbol = sc.nextLine().charAt(0);

        if (symbol == 'q') {
            System.out.println("Goodbye!");
            break;
        }

        System.out.println("Enter the first number:");
        firstNum = sc.nextDouble();
        System.out.println("Enter the second number:");
        secondNum = sc.nextDouble();

       sc.nextLine(); // Consume the newline character left in the buffer

        switch (symbol) {
            case '+':
                sum = firstNum + secondNum;
                System.out.println("Result: " + sum);
                break;
            case '-':
                sum = firstNum - secondNum;
                System.out.println("Result: " + sum);
                break;
            case '*':
                sum = firstNum * secondNum;
                System.out.println("Result: " + sum);
                break;
            case '/':
                if (secondNum != 0) {
                    sum = firstNum/secondNum;
                    System.out.println("Result: "+ sum);
                } else {
                    System.out.println("Result: Infinity");
                }

        }

        }while (symbol != 'q');
    }
}
