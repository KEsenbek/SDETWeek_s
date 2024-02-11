package week14;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
public class Class14_13_1_Light_speed_of_meteor_BeforeAll_and_AfterAll_annotations_in_JUnit_Java {
}

class LightSpeedCalculator {
    private double mass;
    private double acceleration;

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }

    public double calculateSpeed() {
        if (mass <= 0 || acceleration <= 0) {
            return -1.0; // Sentinel value for invalid input
        }
        return Math.sqrt(2 * acceleration * mass);
    }
}

class DataProvider {
    private boolean allowModification = false;
    private double mass;
    private double acceleration;

    public void enableModification() {
        allowModification = true;
    }

    public void disableModification() {
        allowModification = false;
    }

    public void createMap(double mass, double acceleration) {
        if (!allowModification) {
            throw new IllegalStateException("Modification is not allowed.");
        }
        this.mass = mass;
        this.acceleration = acceleration;
    }

    public void clearMap() {
        this.mass = 0;
        this.acceleration = 0;
    }

    public double getMass() {
        return mass;
    }

    public double getAcceleration() {
        return acceleration;
    }
}

class MainTest13_1 {


    private LightSpeedCalculator calculator;
    private static DataProvider dataProvider;


    //write your tests here

    @BeforeAll
    public static void beforeAll() {
        dataProvider = new DataProvider();
        dataProvider.enableModification();
    }


    @AfterAll
    public static void afterAll() {
        dataProvider = new DataProvider();
        dataProvider.disableModification();
    }

    @BeforeEach
    public void setUp() {
        calculator = new LightSpeedCalculator();
        dataProvider = new DataProvider();
        dataProvider.enableModification();


    }

    @AfterEach
    public void tearDown() {
        dataProvider.disableModification();
        dataProvider.clearMap();
    }

    @Test
    public void testCalculateSpeed_Positive() {
        dataProvider.createMap(2, 9.8);
        calculator.setMass(dataProvider.getMass());
        calculator.setAcceleration(dataProvider.getAcceleration());
        double result = calculator.calculateSpeed();
        assertEquals(6.26, result, 0.01);
    }
    @Test
    public void testCalculateSpeed_Negative_NegativeValues() {
        dataProvider.createMap(0, 9.8);
        calculator.setMass(dataProvider.getMass());
        calculator.setAcceleration(dataProvider.getAcceleration());
        double result = calculator.calculateSpeed();
        assertEquals(-1.0, result);
    }
    @Test
    public void testCalculateSpeed_Negative_InvalidInput() {
        dataProvider.createMap(2, 0);
        calculator.setMass(dataProvider.getMass());
        calculator.setAcceleration(dataProvider.getAcceleration());
        double result = calculator.calculateSpeed();
        assertEquals(-1.0, result);
    }
    @Test
    public void testCalculateSpeed_Negative_ZeroMass() {
        dataProvider.createMap(0, 0);
        calculator.setMass(dataProvider.getMass());
        calculator.setAcceleration(dataProvider.getAcceleration());
        double result = calculator.calculateSpeed();
        assertEquals(-1.0, result);
    }
}

