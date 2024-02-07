package week14;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Class14_10_1_Displayname_annotation_practice_Displayname_annotation_in_JUnit_Java {
}



class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return (double) a / b;
    }
}

class MainTest10_1 {
    @DisplayName("Test addition of two positive numbers")
    @Test
    void testAddition() {
        int result = Calculator.add(2, 3);
        assertEquals(5, result, "Addition of 2 and 3 should be 5");
    }
    @DisplayName("Test subtraction of two positive numbers")
    @Test
    void testSubtraction() {
        int result = Calculator.subtract(10, 5);
        assertEquals(5, result, "Subtraction of 10 and 5 should be 5");
    }
    @DisplayName("Test multiplication of two positive numbers")
    @Test
    void testMultiplication() {
        int result = Calculator.multiply(2, 3);
        assertEquals(6, result, "Multiplication of 2 and 3 should be 6");
    }
    @DisplayName("Test Division of two positive numbers")
    @Test
    void testDivision() {
        double result = Calculator.divide(10, 2);
        assertEquals(5.0, result, "Division of 10 by 2 should be 5.0");

        // Verify division by zero behavior
        assertThrows(ArithmeticException.class, () -> Calculator.divide(5, 0));
    }
}