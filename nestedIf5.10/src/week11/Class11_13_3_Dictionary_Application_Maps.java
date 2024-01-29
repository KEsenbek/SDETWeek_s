package week11;

import java.util.HashMap;
import java.util.Map;

public class Class11_13_3_Dictionary_Application_Maps {
    public static void main(String[] args) {

        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("Apple","A fruit with a red or yellowish skin and crisp flesh");
        dictionary.put("Sun","The star around which the Earth orbits");
        printDictionary(dictionary);
    }

    public static void printDictionary(Map<String, String> dictionary) {

        String word = "";
        String mean = "";

        for (Map.Entry<String,String> entry: dictionary.entrySet()) {
            word= entry.getKey();
            mean= entry.getValue();

            System.out.println(word+" - "+ mean);
        }

    }
}
