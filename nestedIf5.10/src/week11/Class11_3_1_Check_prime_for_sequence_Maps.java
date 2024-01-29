package week11;

import java.util.Map;
import java.util.TreeMap;

public class Class11_3_1_Check_prime_for_sequence_Maps {
    public static void main(String[] args) {
        int number = 10;

        checkPrimeNumbers(number);
    }

    public static Map<Integer, Boolean> checkPrimeNumbers(int number) {
        Map<Integer, Boolean> result = new TreeMap<>();

        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                int counter = 0; //нужен для определения Prime number(делится на 1 и на себя)
                for (int j = 1; j <= number; j++) {
                    if (i % j == 0) {
                        counter++;
                    }
                }
                result.put(i, counter==2);
                System.out.println(result);
            }
        }else if (number < 0) {
            for (int i = number; i <= -1; i++) {
                int counter = 0;
                for (int j = -1; j <= i; j--) {
                    if (i % j == 0) {
                        counter++;
                    }
                }
                result.put(i, counter==2);
                System.out.println(result);
            }
        }
        System.out.println(result);
        return result;
    }
}
