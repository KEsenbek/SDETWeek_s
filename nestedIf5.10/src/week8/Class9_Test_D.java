package week8;

public class Class9_Test_D {

        public static void main(String[] args) {
            printDiamond(5, '*');

        }


        public static void printDiamond(int number, char symbol) {

            if (number % 2 == 0 || number <= 0 && number < 50) {
                System.out.println("Invalid input! n must be a positive odd integer less than 50.");
                return; // Exit the method
            }
            // Print the top half of the diamond

            for (int i = 0; i < number; i++) {
                int spaces = number / 2-i;

//                if (i < spaces) {
//                    System.out.print(" ");
//                }
                for (int j = 0; j<number; j++){
                    if (j < spaces) {
                        System.out.print(" ");
                    }
                    System.out.print(symbol);
                }
                System.out.println();
            }

//                System.out.print(symbol);


            }
 //           System.out.println();
//            System.out.println();


}
