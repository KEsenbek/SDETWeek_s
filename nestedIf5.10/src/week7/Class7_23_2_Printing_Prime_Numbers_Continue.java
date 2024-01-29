package week7;

import java.util.Scanner;

public class Class7_23_2_Printing_Prime_Numbers_Continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int i = 2;
        while (number>=i) {
            boolean isPrime = true;

            // Check for factors from 2 to halfway point of the current number
            int j = 2;
            while (j <= i / 2) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
                j++;
            }

            // If isPrime is false, skip to the next iteration
            if (!isPrime) {
                i++;
                continue;
            }

            // If isPrime is true, then the current number is prime
            System.out.println(i);
            i++;
        }

    }
}