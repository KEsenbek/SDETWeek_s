package week7;

import java.util.Scanner;

public class Class7_23_1_Printing_Even_Numbers_Continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int i = 1;
        while (number>=i) {
            if (i%2!=0){ // to skip Odd numbers
                        i++;
                        continue;}

            System.out.println(i);
            i++;
        }
    }
}
