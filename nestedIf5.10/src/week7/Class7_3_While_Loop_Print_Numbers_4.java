package week7;

import java.util.Scanner;

public class Class7_3_While_Loop_Print_Numbers_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for Factorial");
        int num = sc.nextInt();
        int answer = calculateFactorial(num);
        System.out.println(answer);
    }

    public static int calculateFactorial(int num) {
            int i = 1;
            int j = 1;
        while (i<num) {
            i++;
            j=i*j;
        }
        return j;
    }
}
