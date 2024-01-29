package week8;

public class Class8_6_1_Diamond_pattern_ForLoop {
    public static void main(String[] args) {
        printDiamond(5, '*');

    }


    public static void printDiamond(int number, char symbol) {

        if (number % 2 == 0 || number <= 0 && number < 50) {
            System.out.println("Invalid input! n must be a positive odd integer less than 50.");
            return; // Exit the method
        }
        // Print the top half of the diamond
        for (int i = 1; i <= number; i += 2) {
            int spaces = (number - i) / 2;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
        // Print the bottom half of the diamond
        for (int i = number - 2; i >= 1; i -= 2) {
            int spaces = (number - i) / 2;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}