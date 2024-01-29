package week7;

import java.util.Scanner;

public class Class7_7_While_Loop_Increment_By_2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num<2) {
            System.out.println("Error: Please enter a positive integer more than 1");
        }else {
            int i = 0;
            int j = 0;
            while (i<=num) {
                j +=i;
                i+=2;
            }
            System.out.println("The sum of even numbers from 2 to "+num+" is " +j);
            }
    }
}
