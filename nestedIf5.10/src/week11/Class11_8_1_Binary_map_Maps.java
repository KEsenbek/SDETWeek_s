package week11;

import java.util.Map;
import java.util.TreeMap;

public class Class11_8_1_Binary_map_Maps {
    public static void main(String[] args) {
        String binaryDigits = "101010";
        convertBinaryMap(binaryDigits);
        //{0="true", 1="false", 2="true", 3="false", 4="true", 5="false"};
        //String binaryDigits = "11011"
        //Return:
        //{0="true", 1="true", 2="false", 3="true", 4="true", 5="null"}
    }

    public static Map<Integer, String> convertBinaryMap(String input){
        Map<Integer, String> resultMap = new TreeMap<>();
        if (input.isEmpty() || !input.matches("[01]+")) {
            resultMap.put(0, "NO BOOLEAN");
        } else {
            for (int i = 0; i < input.length(); i++){
                resultMap.put(i, input.charAt(i) == '1' ? "true" : "false");
            }
            if (input.length() % 2 != 0){
                resultMap.put(input.length(), "null");
            }
        }
        return resultMap;
    }
}
