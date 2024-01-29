package week7;
public class Class7_19_2_Prime_Number_Checker_For_Loop {
    public static void main(String[] args) {
       boolean answer = isPrime(7);
        System.out.println(answer);
    }

    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int divisor = 2;divisor * divisor <= number;divisor++)

            if (number % divisor == 0) {
                return false;
            }
        return true;
    }

}
