package week7;

import java.util.Scanner;

public class Class7_18_1_Sum_of_even_numbers_between_two_For_Loop {
    public static void main(String[] args) {
        sumOfEvenNumbers(-20,-40);
    }

    public static int sumOfEvenNumbers(int firstNum, int secondNum) {
        //   Scanner sc = new Scanner(System.in);
        //   firstNum = sc.nextInt();
        //   secondNum = sc.nextInt();
        int sum = 0;

        if (firstNum < secondNum) {
            for (int i = firstNum + 1; i < secondNum; ) {
                if (i % 2 == 0) {

                    sum += i;
                    // System.out.println(sum);
                    i++;
                }
                else {
                    i++;
                }
            }
        } else if (firstNum > secondNum) {
            for (int i = firstNum-1; i > secondNum; ) {
                if (i % 2 == 0) {
                    sum += i;
                    i--;
                }else {
                    i--;
                }
            }
        } else {
            return 0;
        }
        System.out.println("The sum of even numbers between "+firstNum+" and "+secondNum+" is "+sum);
        return sum;
    }
}

