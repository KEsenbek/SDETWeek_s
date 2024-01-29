package week7;

import java.util.Scanner;

public class Class7_11_While_Loop_Counter_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        if (num <= 0){
            System.out.println("The number should be positive");
        }else {
            System.out.println("The square numbers from 1 to " + num + " are:");
            int i = 1;
            while (i <= num) {
                int square = i * i;
                System.out.println(square);
                i++;
            }
        }
}
    }

