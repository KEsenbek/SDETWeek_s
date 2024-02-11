package week14;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

import static org.junit.jupiter.api.Assertions.*;
public class Class14_14_1_Water_level_calculator_Disabled_annotation_in_JUnit {
}

class WaterPercentageCalculator {
    public double calculateWaterPercentage(double waterWeight, double totalWeight, String gender, int age, String profession) {
        if (totalWeight <= 0 || waterWeight < 0 || age <= 0) {
            return -1.0; // Sentinel value for invalid input
        }

        double percentage;

        if (gender.equals("Female") && age >= 18 && age <= 50 && !profession.equals("Athlete")) {
            // Bug: Incorrect formula for females between 18 and 50 who are not athletes
            percentage = (waterWeight / totalWeight) * 120;
        } else {
            // Correct formula for other cases
            percentage = (waterWeight / totalWeight) * 100;
        }

        return percentage;
    }
}

class MainTest14_1 {
    private WaterPercentageCalculator calculator = new WaterPercentageCalculator();

    @Test
    public void testCalculateWaterPercentage_ValidInput_1(){
        double waterWeight = 100;
        double totalWeight = 80;
        String gender = "Male";// (e.g., "Male" or "Female").
        int age = 30 ;
        String profession = "";


        assertNotNull(calculator.calculateWaterPercentage(waterWeight,totalWeight,gender,age,profession));
        assertEquals(125.0,calculator.calculateWaterPercentage(waterWeight,totalWeight,gender,age,profession), "Percentage is not equals");
    }

    @Test
    public void testCalculateWaterPercentage_InvalidInput_NegativeWaterWeight(){
        double waterWeight = -10.0;
        double totalWeight = 80.0;
        String gender = "Male";// (e.g., "Male" or "Female").
        int age = 30;
        String profession = "";

        assertNotNull(calculator.calculateWaterPercentage(waterWeight,totalWeight,gender,age,profession));
        assertEquals(-1.0,calculator.calculateWaterPercentage(waterWeight,totalWeight,gender,age,profession),"Watter weight  > 0");

    }

    @Disabled("")
    @Test
    public void testCalculateWaterPercentage_ValidInput_2(){
        double waterWeight = 10.0;
        double totalWeight = 80.0;
        String gender = "Female";// (e.g., "Male" or "Female").
        int age = 30;
        String profession = "Athlete";

        assertNotNull(calculator.calculateWaterPercentage(waterWeight,totalWeight,gender,age,profession));
        assertEquals(15,calculator.calculateWaterPercentage(waterWeight,totalWeight,gender,age,profession),"Incorrect formula for females between 18 and 50 who are not athletes");

    }
    //write your tests here
}