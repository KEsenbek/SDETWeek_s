package week7;

    import java.util.Scanner;

public class Class7_17_1_Sum_of_numbers_For_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int sum = 0;
        int number = sc.nextInt();
        if (number >= 0) {
            for (int i = number; i > 0; ) {

                sum += i;
                i--;
            }
            System.out.println("The sum of all positive numbers preceding " + number + " inclusively is " + sum);
        } else {

            System.out.println("Error! Invalid number");

        }
    }
}
