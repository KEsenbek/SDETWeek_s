package week11;

import java.util.HashMap;
import java.util.Map;

public class Class11_10_2_Updating_Values_Maps {
    public static void main(String[] args) {
        Map<String, String> originalMap = new HashMap<>();
        originalMap.put("101" , "John");
        originalMap.put("102" , "Alice");
        originalMap.put("103" , "Bob");

        Map<String, String> updateMap = new HashMap<>();
        updateMap.put("102" , "Eve");
        updateMap.put("104" ,"Charlie");

        updateValuesWithPutAll(originalMap,updateMap);
    }

    public static Map<String,String> updateValuesWithPutAll(Map<String, String> originalMap, Map<String, String> updateMap) {

        originalMap.putAll(updateMap);

        return originalMap;

    }
}
