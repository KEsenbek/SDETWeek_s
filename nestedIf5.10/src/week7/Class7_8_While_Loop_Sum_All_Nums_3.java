package week7;

public class Class7_8_While_Loop_Sum_All_Nums_3 {
    public static void main(String[] args) {
        calculatePrimeSum(10);
    }

    public static int calculatePrimeSum(int N) {
        int sum = 0;
        int number = 2;
        while (number <= N) {
            if (isPrime(number)) {
                sum += number;
            }
            number++;
        }
        return sum;
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        int divisor = 2;
        while (divisor * divisor <= num) {
            if (num % divisor == 0) {
                return false;
            }
            divisor++;
        }
        return true;
    }
}
