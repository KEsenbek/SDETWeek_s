package week7;

public class Class7_12_1_Factorial_with_while_loop_and_switch_case {
    public static void main(String[] args) {
        calculateFactorial(5);
    }

    public static int calculateFactorial(int num) {


        if (num < 0) {
           // System.out.println(-1);
            return -1;
        }

            int sum = 1;
            while (num > 0) {
                switch (num) {
                    case 1:
                        sum *= 1;
                        break;
                    default:
                        sum *= num;
                        break;
                }
                // Decrement n
                num--;
            }
            return sum;
        }


}

