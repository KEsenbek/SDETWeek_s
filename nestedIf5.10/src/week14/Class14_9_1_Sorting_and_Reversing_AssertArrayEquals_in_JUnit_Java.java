package week14;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
public class Class14_9_1_Sorting_and_Reversing_AssertArrayEquals_in_JUnit_Java {
}

class ArrayManipulator {
    public int[] sortArray(int[] arr) {
        if (arr == null) {
            return null;
        }

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public int[] reverseArray(int[] arr) {
        if (arr == null) {
            return null;
        }

        int n = arr.length;
        int[] reversed = new int[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = arr[n - i - 1];
        }
        return reversed;
    }
}

class MainTest9_1 {
    //write your tests here
    @Test
    public void testSortArray(){
        int[] arrActual = new int[]{6,2,3,1,5,0};
        int[] arrExpected = new int[]{0,1,2,3,5,6};

        ArrayManipulator arrayManipulator = new ArrayManipulator();

       // System.out.println(Arrays.toString(arrayManipulator.sortArray(arr)));
        assertArrayEquals(arrExpected,arrayManipulator.sortArray(arrActual), "No order");
    }

    @Test
    public void testReverseArray(){
        int[] arrActual = new int[]{6,2,3,1,5,0};
        int[] arrExpected = new int[]{0,5,1,3,2,6};

        ArrayManipulator arrayManipulator = new ArrayManipulator();

        // System.out.println(Arrays.toString(arrayManipulator.reverseArray(arrActual)));
        assertArrayEquals(arrExpected,arrayManipulator.reverseArray(arrActual), "No reverse order");
    }

    @Test
    public void testEmptyArray(){
        int[] arrActual = new int[]{};
        int[] arrExpected = new int[]{};

        ArrayManipulator arrayManipulator = new ArrayManipulator();

        assertArrayEquals(arrExpected,arrayManipulator.sortArray(arrActual));
        assertArrayEquals(arrExpected,arrayManipulator.reverseArray(arrActual));

    }    @Test
    public void testNullArray(){
        int[] arrActual = null;


        ArrayManipulator arrayManipulator = new ArrayManipulator();

        assertArrayEquals(null,arrayManipulator.sortArray(arrActual));
        assertArrayEquals(null,arrayManipulator.reverseArray(arrActual));

    }
}