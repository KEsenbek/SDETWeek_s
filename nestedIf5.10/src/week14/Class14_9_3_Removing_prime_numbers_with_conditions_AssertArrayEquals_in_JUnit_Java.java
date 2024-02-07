package week14;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
public class Class14_9_3_Removing_prime_numbers_with_conditions_AssertArrayEquals_in_JUnit_Java {
}

class PrimeNumberRemovalTest {

    // Method to remove prime numbers from the array
    public static int[] removePrimeNumbers(int[] inputArray) {
        if (inputArray == null) {
            return null;
        }

        if (inputArray.length < 3) {
            // If the array length is less than 3, return the first 5 prime numbers
            return getFirstFivePrimes();
        }

        // Create a new array to store non-prime numbers
        int[] resultArray = new int[inputArray.length];
        int resultSize = 0;

        for (int num : inputArray) {
            if (!isPrime(num)) {
                resultArray[resultSize] = num;
                resultSize++;
            }
        }

        // Resize the resultArray to match the number of non-prime elements
        return resizeArray(resultArray, resultSize);
    }

    // Helper method to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Helper method to get the first 5 prime numbers starting from 0
    private static int[] getFirstFivePrimes() {
        int[] primes = new int[]{2, 3, 5, 7, 11}; // First 5 prime numbers
        return primes;
    }

    // Helper method to resize an array to a specified size
    private static int[] resizeArray(int[] array, int newSize) {
        int[] newArray = new int[newSize];
        System.arraycopy(array, 0, newArray, 0, newSize);
        return newArray;
    }
}

class MainTest9_3 {
    //write your tests here
    @Test
    public void testRemovePrimeNumbersWithNullInput(){
        int[] actualArr = null;

        assertArrayEquals(null, PrimeNumberRemovalTest.removePrimeNumbers(actualArr),"Array is not null" );


    }
    @Test
    public void testRemovePrimeNumbersWithPrimeNumbers(){
        int[] expectArr = new int[]{4,6,8,9,10,12,14,15};
        int[] actualArr = new int[]{2,3,4,5,6,7,8,9,10,11,12,13,14,15};


        assertArrayEquals(expectArr, PrimeNumberRemovalTest.removePrimeNumbers(actualArr),"Do not remove prime numbers" );
    }
    @Test
    public void testRemovePrimeNumbersWithEmptyArray(){
        int[] expectArr = new int[]{2, 3, 5, 7, 11};
        int[] actualArr = new int[]{};

        assertArrayEquals(expectArr, PrimeNumberRemovalTest.removePrimeNumbers(actualArr),"Array is not null" );

    }
    @Test
    public void testRemovePrimeNumbersWithShortArray(){
        int[] expectArr = new int[]{2, 3, 5, 7, 11};
        int[] actualArr = new int[]{0,1};


        assertArrayEquals(expectArr, PrimeNumberRemovalTest.removePrimeNumbers(actualArr),"Do not remove prime numbers" );
    }
}
