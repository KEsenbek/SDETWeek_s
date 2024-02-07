package week13;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Class13_18_1_No_more_elements_Validation_Exceptions_with_Try_Catch_Block_in_Java {
    public static void main(String[] args) {

      //  readNextElement();
    }

    public static String readNextElement(Scanner scanner) {
        try{
            return scanner.next();
        }catch (NoSuchElementException e) {
            System.out.println("Error: No more elements to read.");
            return "";

        }

    }

}
