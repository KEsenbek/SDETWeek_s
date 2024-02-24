package week15;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Class15_4_1_Find_and_reverse_Occurrences_in_Text_Intro_to_Regex_Literals__Character_Classes {
    public static void main(String[] args) {
        Map<String,String> inputs = new LinkedHashMap<>();
        inputs.put("John", "Abel");
        inputs.put("Jane", "Abel");
        inputs.put("David", "Charlie");
        inputs.put("Alice", "David");
        findAndReverseKeys(inputs);
    }

    public static ArrayList<String> findAndReverseKeys(Map<String, String> inputs) {
        ArrayList<String> result = new ArrayList<>();
        String  strForAnswer = "";
        String str = "";
        for (Map.Entry<String,String> names: inputs.entrySet()){
            if(names.getValue().matches("Abel")){
                str=names.getKey();
                strForAnswer = "";
                for (int i = str.length()-1; i >=0; i--) {
                    strForAnswer+=str.charAt(i);
                }
                result.add(strForAnswer);
            }
        }

        return result;
    }
}
