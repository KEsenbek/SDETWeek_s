package week14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;
public class Class14_10_2_Calculate_average_method_and_tests_Displayname_annotation_in_JUnit_Java {
}

class AverageCalculator {
    public static double calculateAverage(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Input array is null or empty.");
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return (double) sum / numbers.length;
    }
}

class MainTest10_2 {

    @DisplayName("Test case 1: Test average calculation for positive integers")
    @Test
    public void test1(){
        int[] actualArr = new int[]{1,2,3,4,5};
        double resultActualArr = AverageCalculator.calculateAverage(actualArr);
        double expect = 3;


        assertEquals(expect,resultActualArr,"Average is not positive");
    }

    @DisplayName("Test case 2: Test average calculation for negative integers")
    @Test
    public void test2(){
        int[] actualArr = new int[]{-1,-2,-3,-4,-5};
        double resultActualArr = AverageCalculator.calculateAverage(actualArr);
        double expect = -3;


        assertEquals(expect,resultActualArr,"Average is not negative");

    }
    @DisplayName("Test case 3: Test average calculation for a single integer")
    @Test
    public void test3(){
        int[] actualArr = new int[]{10};
        double resultActualArr = AverageCalculator.calculateAverage(actualArr);
        double expect = 10;


        assertEquals(expect,resultActualArr,"Average is not single integer");

    }
    @DisplayName("Test case 4: Test average calculation for an empty array")
    @Test
    public void test4(){

        String exceptResult = "Input array is null or empty.";
        String actualResult = "Input array is null or empty.";

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,()->{
            AverageCalculator.calculateAverage(new int[]{});
        }   );

        assertEquals(exceptResult,actualResult,"Average is not empty array");


    }
    @DisplayName("Test case 5: Test average calculation for null input")
    @Test
    public void test5(){
        String exceptResult = "Input array is null or empty.";
        String actualResult = "Input array is null or empty.";

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,()->{
            AverageCalculator.calculateAverage(null);
        }   );

        assertEquals(exceptResult,actualResult,"Average is not null");
    }
    @DisplayName("Test case 6: Test average calculation for mixed positive and negative integers")
    @Test
    public void test6(){
        int[] actualArr = new int[]{-1,-2,-3,-4,-5,10,20,30};
        double resultActualArr = AverageCalculator.calculateAverage(actualArr);
        double expect = 5.625;


        assertEquals(expect,resultActualArr,"Average is not negative");

    }

}
