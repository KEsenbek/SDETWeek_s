package week14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
public class Class14_11_1_Prime_Number_Checker_Testing_with_Parameterized_Tests_Parameterized_Tests_in_JUnit_Java {
}

class PrimeNumberChecker {

    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        // We only need to check divisors up to the square root of the number.
        int sqrt = (int) Math.sqrt(number);
        for (int i = 2; i <= sqrt; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}

class MainTest11_1 {

    private final PrimeNumberChecker checker = new PrimeNumberChecker();


    @ParameterizedTest
    @ValueSource(ints = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29})
    public void testIsPrimeWithPrimes(int number) {
        Assertions.assertTrue(checker.isPrime(number));

    }

    @ParameterizedTest
    @ValueSource(ints = {1, 4, 6, 8, 9, 10, 12, 14, 15, 20})
    public void testIsPrimeWithNonPrimes(int number) {
        Assertions.assertFalse(checker.isPrime(number));
    }
}
