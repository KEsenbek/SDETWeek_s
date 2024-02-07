package week13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Class13_17_3_User_Input_Validation_Exceptions_with_Try_Catch_Block_in_Java {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter a number:");
            double income = sc.nextDouble();
            System.out.println("You entered: "+income);
        }catch (InputMismatchException e){
            System.out.println("Please enter a valid number");
        }
    }


}
