package week8;

public class Class8_4_2_Calculate_Prime_Numbers_In_Range_ForLoop {
    public static void main(String[] args) {
        calculatePrimeNumbersInRange(1, 1000);

    }

    public static int calculatePrimeNumbersInRange(int start, int end) {
            if (start<1){
                return 0;
            }else if (end<start) {
                System.out.println("end num less then start");
                return 0;
            }
        int sum = 0;
        for (int i = start; i<=end; i++){
            boolean isPrime = true;


            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i + " is prime.");
                sum += i;

            }

        }
        System.out.println(sum);
        return sum;
    }
}

