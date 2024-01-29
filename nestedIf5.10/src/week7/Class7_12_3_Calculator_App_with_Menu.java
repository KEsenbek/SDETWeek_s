package week7;

import java.util.Scanner;

public class Class7_12_3_Calculator_App_with_Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        boolean isExit = true;

        String choises= "";
        while (isExit) {

            System.out.println("Calculator Menu:\n" +
                    "1. Addition\n" +
                    "2. Subtraction\n" +
                    "3. Multiplication\n" +
                    "4. Division\n" +
                    "0. Exit");
            System.out.println("Choose an option:");

            choises = sc.nextLine();


            if (choises.equals("0") || choises.equalsIgnoreCase("exit")) {
                    System.out.println("Exiting the calculator. Goodbye!");
                break;
            }
            double firstNum = 0;
            double secondNum = 0;
            double sum = 0;
            System.out.println("Enter first number:");
            firstNum = sc.nextDouble();
            System.out.println("Enter second number:");
            secondNum = sc.nextDouble();
            sc.nextLine();//By adding sc.nextLine(); after reading the integers,
            // you consume the newline character, and your program should work as expected.
            // This ensures that the input for the next iteration is not affected by the newline character left in the buffer.
            switch (choises) {

                case "1":
                case "Addition":
                    sum = firstNum + secondNum;
                    System.out.printf("Result: %.1f + %.1f = %.1f\n",firstNum,secondNum, sum );
                    break;
                case "2":
                case "Subtraction":
                    sum = firstNum - secondNum;
                    System.out.printf("Result: %.1f - %.1f = %.1f\n",firstNum,secondNum, sum );
                    break;
                case "3":
                case "Multiplication":
                    sum = firstNum * secondNum;
                    System.out.printf("Result: %.1f * %.1f = %.1f\n",firstNum,secondNum, sum );
                    break;
                case "4":
                case "Division":
                    sum = firstNum / secondNum;
                    System.out.printf("Result: %.1f / %.1f = %.1f\n",firstNum,secondNum, sum );
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    isExit = false;
            }

        }


    }
}
