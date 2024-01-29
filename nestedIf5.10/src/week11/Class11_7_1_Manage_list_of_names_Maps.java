package week11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Class11_7_1_Manage_list_of_names_Maps {
    public static void main(String[] args) {

        String names = "Chris Brad; Tom Misch; Kate Stewart";

        manageMap(names);
        // Returns {1:Chris Brad, 2:Misch Tom, 3:Stewart Kate}
    }

    public static Map<Integer, String> manageMap(String sentenceOfFullNames) {
        String[] fullNames = sentenceOfFullNames.trim().split(";+\\s+");
        Map<Integer, String> numberedFullNamesMap = new LinkedHashMap<>();
        String firstName;
        String lastName;
        int counter = 1;
        for (String fullName : fullNames) {
            String[] firstAndLastNames = fullName.split("\\s");
            firstName = firstAndLastNames[0];
            lastName = firstAndLastNames[1];
            if (firstName.length() > lastName.length()) {
                numberedFullNamesMap.put(counter, firstName.concat(" ").concat(lastName));
            } else {
                numberedFullNamesMap.put(counter, lastName.concat(" ").concat(firstName));
            }
            counter++;
        }
        return  numberedFullNamesMap;
    }
}
