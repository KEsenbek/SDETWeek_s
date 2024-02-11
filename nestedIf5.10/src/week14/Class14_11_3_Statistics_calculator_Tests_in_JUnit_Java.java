package week14;

import java.util.*;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
public class Class14_11_3_Statistics_calculator_Tests_in_JUnit_Java {
}

class StatisticalCalculator {
    public static Map<String, Double> calculateStatistics(List<Double> data) {
        if (data == null) {
            Map<String, Double> errorResult = new HashMap<>();
            errorResult.put("Error", -1.0); // Use a sentinel value for error
            return errorResult;
        }

        Map<String, Double> result = new HashMap<>();
        if (data.size() == 6) {
            Collections.sort(data);
            result.put("average", calculateAverage(data));
            result.put("q2", calculateMedian(data));
            result.put("q3", calculateThirdQuartile(data));
        } else {
            result.put("Error", -1.0); // Use a sentinel value for error
            if (data.size() < 6) {
                result.put("Low number of inputs", -1.0);
            } else {
                result.put("High number of inputs", -1.0);
            }
        }

        return result;
    }

    private static double calculateAverage(List<Double> data) {
        double sum = 0;
        for (Double value : data) {
            sum += value;
        }
        return sum / data.size();
    }

    private static double calculateMedian(List<Double> data) {
        int middle = data.size() / 2;
        if (data.size() % 2 == 0) {
            double mid1 = data.get(middle - 1);
            double mid2 = data.get(middle);
            return (mid1 + mid2) / 2.0;
        } else {
            return data.get(middle);
        }
    }

    private static double calculateThirdQuartile(List<Double> data) {
        int size = data.size();
        int index = size * 3 / 4;
        if (size % 4 == 0) {
            return (data.get(index - 1) + data.get(index)) / 2.0;
        } else {
            return data.get(index);
        }
    }
}

class MainTest11_3 {
    //write your tests here
    @ParameterizedTest
    @ValueSource(strings = {
            "1.234,2.567,3.789,4.123,5.456,6.789",
            "10.987,20.456,30.789,40.123,50.567,60.890"
    })
    void testCalculateStatistics_Positive(String input) {
        // Parse the input string into a list of double values
        List<Double> values = parseInputString(input);

        // Call the calculateStatistics method
        Map<String, Double> result = StatisticalCalculator.calculateStatistics(values);

        // Verify the correctness of the results for positive cases
        assertNotNull(result);
        assertTrue(result.containsKey("average"));
        assertTrue(result.containsKey("q2"));
        assertTrue(result.containsKey("q3"));

        // Additional assertions based on the expected behavior
        assertEquals(calculateExpectedAverage(values), result.get("average"), 1e-5);
        assertEquals(calculateExpectedMedian(values), result.get("q2"), 1e-5);
        assertEquals(calculateExpectedThirdQuartile(values), result.get("q3"), 1e-5);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "1.234,2.567,3.789,4.123",
            "1.234,2.567,3.789,4.123,5.456,6.789,7.123",
            ""
    })
    void testCalculateStatistics_Negative(String input) {
        // Parse the input string into a list of double values
        List<Double> values = parseInputString(input);

        // Call the calculateStatistics method
        Map<String, Double> result = StatisticalCalculator.calculateStatistics(values);

        // Verify the correctness of the results for negative cases
        assertNotNull(result);
        assertTrue(result.containsKey("Error"));
        assertTrue(result.containsValue(-1.0));

        if (values.size() < 6) {
            assertTrue(result.containsKey("Low number of inputs"));
            assertTrue(result.containsValue(-1.0));
        } else {
            assertTrue(result.containsKey("High number of inputs"));
            assertTrue(result.containsValue(-1.0));
        }
    }

    // Helper method to parse the input string into a list of double values
    private List<Double> parseInputString(String input) {
        if (input.isEmpty()) {
            return Collections.emptyList(); // Return an empty list for an empty input
        }

        String[] valuesArray = input.split(",");
        return Arrays.stream(valuesArray)
                .map(Double::parseDouble)
                .collect(Collectors.toList());

    }

    // Helper methods to calculate expected values for assertions
    private double calculateExpectedAverage(List<Double> values) {
        return values.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }

    private double calculateExpectedMedian(List<Double> values) {
        List<Double> sortedValues = values.stream().sorted().collect(Collectors.toList());
        int middle = sortedValues.size() / 2;
        if (sortedValues.size() % 2 == 0) {
            double mid1 = sortedValues.get(middle - 1);
            double mid2 = sortedValues.get(middle);
            return (mid1 + mid2) / 2.0;
        } else {
            return sortedValues.get(middle);
        }
    }

    private double calculateExpectedThirdQuartile(List<Double> values) {
        List<Double> sortedValues = values.stream().sorted().collect(Collectors.toList());
        int size = sortedValues.size();
        int index = size * 3 / 4;
        if (size % 4 == 0) {
            return (sortedValues.get(index - 1) + sortedValues.get(index)) / 2.0;
        } else {
            return sortedValues.get(index);
        }
    }
}