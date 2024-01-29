package week7;

import java.util.Scanner;

public class Class7_3_While_Loop_Print_Numbers_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char method = sc.next().charAt(0);

        printOddOrEvenNumbers(num,method);
    }

    public static int printOddOrEvenNumbers (int num, char method) {
        int i = 1;
        if (method == 'O') {
            while (i <= num) {

                System.out.println(i);
                i = i + 2;
            }
        } else if (method == 'E') {
            i = 2;
            while (i <= num) {
                System.out.println(i);
                i += 2;
            }
        }
        return i;
    }
}

