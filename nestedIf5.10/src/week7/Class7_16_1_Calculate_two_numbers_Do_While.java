package week7;

import java.util.Scanner;

public class Class7_16_1_Calculate_two_numbers_Do_While {
    public static void main(String[] args) {
        //Enter first number: 10
        //Enter second number: 5
        //Enter operator (+, -, *, /): +
        //Result: 15.0
        //Do you want to continue? (y/n) y

        //Enter first number: 10.0
        //Enter second number: 2
        //Enter operator (+, -, *, /): &
        //Invalid operator!
        //Do you want to continue? (y/n) n
        String answer;
        String value = "";
        double firstNum;
        double secondNum;
        double sum;
        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Enter first number:");
            firstNum = sc.nextDouble();

            System.out.println("Enter second number:");
            secondNum = sc.nextDouble();


            System.out.println("Enter operator (+, -, *, /):");
            value = sc.next();


            switch (value) {
                case "+":
                    sum = firstNum + secondNum;
                    System.out.printf("Result: %.1f\n", sum);
                    break;
                case "-":
                    sum = firstNum - secondNum;
                    System.out.printf("Result: %.1f\n", sum);
                    break;
                case "*":
                    sum = firstNum * secondNum;
                    System.out.printf("Result: %.1f\n", sum);
                    break;
                case "/":
                    if (secondNum != 0) {
                    sum = firstNum/secondNum;
                    System.out.printf("Result: %.1f\n", sum);
                } else {
                    System.out.println("Result: Infinity");
                }

                    break;
                default:
                    System.out.println("Invalid operator!");

            }



            System.out.println("Do you want to continue? (y/n)");
            answer = sc.next();

        }
            while (!answer.equalsIgnoreCase("n")) ;

        }
}


