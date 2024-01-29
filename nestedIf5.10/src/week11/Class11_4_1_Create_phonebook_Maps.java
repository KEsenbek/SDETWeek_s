package week11;

import java.util.HashMap;
import java.util.Map;

public class Class11_4_1_Create_phonebook_Maps {
    public static void main(String[] args) {


        String names = "Alice Bob Charlie";
        String phoneNumbers = "1234567890 9876543210 5555555555";
        createContactList(names, phoneNumbers);

        //Return:{ "Alice" : "1234567890", "Bob" : "9876543210", "Charlie" : "5555555555" }
        //Output: {Alice=1234567890, Bob=9876543210, Charlie=5555555555, Max=-1}
        //Output: {Alice=1234567890, Bob=9876543210, Charlie=5555555555, unknown1=996221221}
    }

    //write your static method here. No need to add Main class or main method.
    public static Map<String, String> createContactList(String names, String phoneNumbers) {
        // Split the input strings into arrays of names and phone numbers
        String[] nameArray = names.split(" ");
        String[] phoneNumberArray = phoneNumbers.split(" ");
        // Create a map to store the name-phone number pairs
        Map<String, String> contactList = new HashMap<>();
        // Create a map to track the count of each name
        Map<String, Integer> nameCount = new HashMap<>();

        // Loop through the nameArray and add name-phone number pairs to the contactList
        for (int i = 0; i < nameArray.length; i++) {
            String name = nameArray[i];
            // Check if there are remaining phone numbers in phoneNumberArray; if not, use "-1" as a default value
            String phoneNumber = (i < phoneNumberArray.length) ? phoneNumberArray[i] : "-1";

            // If the name is already in the contactList, skip to the next iteration
            if (contactList.containsKey(name)) {
                continue;
            }

            // Get the count of the current name (default to 0 if not found) and increment it
            int count = nameCount.get(name) != null ? nameCount.get(name) : 0;
            nameCount.put(name, count + 1);

            // Add the name-phone number pair to the contactList
            contactList.put(name, phoneNumber);
        }

        // Loop through the remaining phone numbers and add them as "unknown" entries
        for (int i = nameArray.length; i < phoneNumberArray.length; i++) {
            // Check if the current phone number is already in the contactList values
            if (!contactList.containsValue(phoneNumberArray[i])) {
                // Add an "unknown" entry with an incremental number as a key
                contactList.put("unknown" + (i - nameArray.length + 1), phoneNumberArray[i]);
            }
        }

        // Return the populated contactList
        return contactList;
    }
}
