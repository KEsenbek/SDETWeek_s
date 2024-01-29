package week11;

import java.util.*;

public class Class11_13_2_Population_Data_Analysis_Maps {
    public static void main(String[] args) {
        Map<String, Integer> phoneBook = new HashMap<>();
        phoneBook.put("Chicago",2697000);
        phoneBook.put("Los-Angeles",3849000);
        phoneBook.put("Houston",2288000);

        findLargestCity(phoneBook);
    }

    public static void findLargestCity(Map<String, Integer> phoneBook) {

        String largestCity = null;
        int largestPopulation = Integer.MIN_VALUE;

        // Iterate through the map using entrySet
        for (Map.Entry<String, Integer> entry : phoneBook.entrySet()) {
            String city = entry.getKey();
            int population = entry.getValue();

            // Check if the current city has a higher population
            if (population > largestPopulation) {
                largestPopulation = population;
                largestCity = city;
            }
        }

        System.out.println("The city with the highest population is "+largestCity + " with a population of "+largestPopulation);

    }
}
