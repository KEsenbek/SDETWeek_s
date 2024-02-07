package week14;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Class14_5_1_HealthcareDataProcessor_AssertEquals_with_Maps_in_JUnit_Java {
}

class HealthcareDataProcessor {

    // Business function to process healthcare data and create a transformed data map
    public Map<String, String> processHealthcareData(Map<String, String> originalDataMap) {
        Map<String, String> transformedDataMap = new HashMap<>();

        // Apply the mapping logic here to transform the original data into the new format
        // For this example, we'll just use a simple mapping scheme

        // Patient Name mapping
        String patientName = originalDataMap.get("patientName");
        if(patientName!= null) {
            transformedDataMap.putIfAbsent("PT_NAME", patientName);
        }

        // Age mapping
        String age = originalDataMap.get("age");
        if(age != null) {

            transformedDataMap.putIfAbsent("PT_AGE", age);
        }

        // Gender mapping
        String gender = originalDataMap.get("gender");
        if(gender != null) {
            transformedDataMap.putIfAbsent("PT_GENDER", mapGender(gender));
        }

        // Diagnosis mapping
        String diagnosis = originalDataMap.get("diagnosis");
        if(diagnosis != null) {
            transformedDataMap.putIfAbsent("DIAGNOSIS_DESC", diagnosis);
        }
        // Medication mapping
        String medication = originalDataMap.get("medication");
        if(medication != null) {
            transformedDataMap.put("MED_NAME", medication);
        }

        // Add more healthcare data points mapping here as necessary

        return transformedDataMap;
    }

    // Helper method to map gender to the desired format
    private String mapGender(String originalGender) {
        // For simplicity, let's assume we just convert "Male" to "M" and "Female" to "F"
        if ("Male".equalsIgnoreCase(originalGender)) {
            return "M";
        } else if ("Female".equalsIgnoreCase(originalGender)) {
            return "F";
        } else {
            return "Unknown";
        }
    }
}

class MainTest5_1 {
    @Test
    public void testProcessHealthcareData_WithCompleteData() {
        // Test case with complete data for all healthcare data points
        Map<String,String> originalDataMap = new HashMap<>();
        originalDataMap.put("patientName", "John Doe");
        originalDataMap.put("age", "45");
        originalDataMap.put("gender", "Male");
        originalDataMap.put("diagnosis", "Hypertension");
        originalDataMap.put("medication", "Lisinopril");

        Map<String,String> expectDataMap = new HashMap<>();
        expectDataMap.put("PT_NAME", "John Doe");
        expectDataMap.put("PT_AGE", "45");
        expectDataMap.put("PT_GENDER", "M");
        expectDataMap.put("DIAGNOSIS_DESC", "Hypertension");
        expectDataMap.put("MED_NAME", "Lisinopril");

        HealthcareDataProcessor healthcareDataProcessor = new HealthcareDataProcessor();
        Map<String,String> actualMap = healthcareDataProcessor.processHealthcareData(originalDataMap);

        assertEquals(expectDataMap, actualMap);
    }

    @Test
    public void testProcessHealthcareData_WithMissingData() {
        // Test case with missing data for some healthcare data points
        Map<String,String> originMap = new HashMap<>();
        originMap.put("patientName", "Jane Smith");
        originMap.put("age", "30");

        Map<String,String> expectMap = new HashMap<>();
        expectMap.put("PT_NAME", "Jane Smith");
        expectMap.put("PT_AGE", "30");

        HealthcareDataProcessor healthcareDataProcessor = new HealthcareDataProcessor();
        Map<String,String> convertMap = healthcareDataProcessor.processHealthcareData(originMap);

        assertEquals(expectMap,convertMap);
        assertFalse(convertMap.containsKey("PT_GENDER"));
        assertFalse(convertMap.containsKey("DIAGNOSIS_DESC"));
        assertFalse(convertMap.containsKey("MED_NAME"));

    }

    @Test
    public void testProcessHealthcareData_WithInvalidGender() {
        // Test case with an invalid gender value
        Map<String,String> originalMap = new HashMap<>();
        originalMap.put("patientName", "Michael Johnson");
        originalMap.put("age", "50");
        originalMap.put("gender", "Other");


        Map<String,String> expectMap = new HashMap<>();
        expectMap.put("PT_NAME", "Michael Johnson");
        expectMap.put("PT_AGE", "50");
        expectMap.put("PT_GENDER", "Unknown");
        // Invalid gender should be mapped to "Unknown"

        HealthcareDataProcessor healthcareDataProcessor = new HealthcareDataProcessor();

        Map<String,String>  convertMap = healthcareDataProcessor.processHealthcareData(originalMap);

        assertEquals(expectMap,convertMap);
    }

}