package week15;

import java.util.ArrayList;
import java.util.List;

public class Class15_3_1_Find_phone_numbers_Occurrences_in_Text_Intro_to_Regex_Literals__Character_Classes {
    public static void main(String[] args) {


        ArrayList<String> incomeList = new ArrayList<>();
        incomeList.add("123 456 2390");
        incomeList.add("123 888 5490");
        incomeList.add("123 670 7800");
        incomeList.add("23 456 2390");
        extractMatchingPhoneNumbers(incomeList);

    }

    public static ArrayList<String> extractMatchingPhoneNumbers(ArrayList<String> USPhoneNumbers) {
        //The phone numbers to find: 123 XXX XXX0
        ArrayList<String> outputList = new ArrayList<>();
        for (String string:USPhoneNumbers){
            if (string.matches("123........0")){
                outputList.add(string);
            }
        }
      return outputList;
    }
}
