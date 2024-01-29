package week7;

public class Class7_24_1_Even_numbers_with_skip_Continue {
    public static void main(String[] args) {
        printEvenNumbers(15);
    }

    public static void printEvenNumbers(int number) {
        if (number == 0){
            System.out.println("Error! Number should be bigger than 0");
        }
        for (int i = 1; i<=number; i++) {

            if (i%2 != 0 || i%3 == 0) {
                continue;
            }

            System.out.println(i);
        }
    }
}
