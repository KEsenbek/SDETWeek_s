package week14;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
public class Class14_12_1_Profit_calculator_BeforeEach_and_AfterEach_annotations_in_JUnit_Java {
}

class TestDataProvider {
    private Map<String, Double> testData = null;

    public void createEmptyMap() {
        testData = new HashMap<>();
    }

    public Map<String, Double> getTestData() {
        if (testData == null) {
            throw new IllegalStateException("testData map has not been created. Call createEmptyMap first.");
        }
        return testData;
    }

    public void clearTestData() {
        if (testData != null) {
            testData.clear();
        }
    }
}

class ProfitCalculator {
    public static double calculateProfit(Map<String, Double> values) {
        if (values == null || !values.containsKey("net") || !values.containsKey("expenses") || !values.containsKey("salaries")) {
            return -1.0; // Invalid input data
        }

        double net = values.get("net");
        double expenses = values.get("expenses");
        double salaries = values.get("salaries");

        if (net < 0 || expenses < 0 || salaries < 0) {
            return -1.0; // Values must be non-negative
        }

        double profit = net - (expenses + salaries);
        return profit;
    }
}

class MainTest12_1 {

    TestDataProvider testDataProvider;


    @BeforeEach
    public void setUp() {

        testDataProvider = new TestDataProvider();
        testDataProvider.createEmptyMap();
    }
    @AfterEach
    public void tearDown() {
        testDataProvider.clearTestData();
    }
    //write your tests here

    @Test
     public void testCalculateProfit_Positive(){
        Map<String,Double> expect = new HashMap<>();
        expect.put("net", 500.0);
        expect.put("expenses", 150.0);
        expect.put("salaries", 200.0);

        assertNotNull(ProfitCalculator.calculateProfit(expect));
        assertEquals(150.0, ProfitCalculator.calculateProfit(expect), " method with valid input ");


    }

    @Test
    public void testCalculateProfit_Negative_InvalidInput(){
        Map<String,Double> expect = new HashMap<>();
        expect.put("", 500.0);
        expect.put("", 150.0);
        expect.put("", 200.0);

        assertNotNull(ProfitCalculator.calculateProfit(expect));
        assertEquals(-1.0, ProfitCalculator.calculateProfit(expect), " method with valid input ");
    }

    @Test
    public void testCalculateProfit_Negative_NegativeValues(){
        Map<String,Double> expect = new HashMap<>();
        expect.put("net", -500.0);
        expect.put("expenses", 150.0);
        expect.put("salaries", 200.0);

        assertNotNull(ProfitCalculator.calculateProfit(expect));
        assertEquals(-1.0, ProfitCalculator.calculateProfit(expect), " method with valid input ");
    }

    @Test
    public void testCalculateProfit_Negative_InsufficientData(){
        Map<String,Double> expect = new HashMap<>();
        expect.put("net", 500.0);
        expect.put("expenses", 150.0);


        assertNotNull(ProfitCalculator.calculateProfit(expect));
        assertEquals(-1.0, ProfitCalculator.calculateProfit(expect), " method with valid input ");


    }
}