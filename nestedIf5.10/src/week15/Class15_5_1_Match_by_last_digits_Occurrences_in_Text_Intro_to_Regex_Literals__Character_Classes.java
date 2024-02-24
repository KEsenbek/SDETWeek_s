package week15;

import java.util.ArrayList;

public class Class15_5_1_Match_by_last_digits_Occurrences_in_Text_Intro_to_Regex_Literals__Character_Classes {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("ASdlk");
        names.add("Sam123");
        names.add("Steve999");
        names.add("Sarah222");
//Sam123
//Steve999
//Sarah222
//Sophia333
        findPatientNames(names);
    }


        public static ArrayList<String> findPatientNames(ArrayList<String> patientRecords) {
            ArrayList<String> patientNames = new ArrayList<>();
            String pattern = "^S.+\\d{3}$";
            for (String record : patientRecords) {
                if (record.matches(pattern)) {
                    String name = record.substring(0, record.length() - 3);
                    patientNames.add(name);
                }
            }
            return patientNames;
        }
}
