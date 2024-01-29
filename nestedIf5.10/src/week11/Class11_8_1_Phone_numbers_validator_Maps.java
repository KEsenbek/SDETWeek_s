package week11;

import java.util.HashMap;
import java.util.Map;

public class Class11_8_1_Phone_numbers_validator_Maps {
    public static void main(String[] args) {
        String phoneNumbers = "023-456-7890, 555-5555, 0876543210, 0123456789";
        validatePhoneNumbers(phoneNumbers);
    }

    public static Map<String, String> validatePhoneNumbers(String phoneNumbers) {
        Map<String, String> listOfPhoneNum = new HashMap<>();
        String[] numArray = phoneNumbers.split(",");

        for (int i = 0; i < numArray.length; i++) {
            String originalNumber = numArray[i].trim();
            String cleanedNumber = originalNumber.replaceAll("[^0-9]", "");

            if (cleanedNumber.length() == 10 && cleanedNumber.startsWith("0") && !cleanedNumber.endsWith("9")) {
                listOfPhoneNum.put(originalNumber, Integer.toString(i));
            }
        }

        if (listOfPhoneNum.isEmpty()) {
            listOfPhoneNum.put("0", "EMPTY");
        }

        return listOfPhoneNum;
    }
}
