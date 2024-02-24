package week15;

import java.util.ArrayList;

public class Class15_3_2_Expiring_passwords_Occurrences_in_Text_Intro_to_Regex_Literals__Character_Classes {
    public static void main(String[] args) {

        ArrayList<String> pass = new ArrayList<>();
        pass.add("Aabcd17!");
        pass.add("Bxyz123!");
        pass.add("235445ads!");

        System.out.println(extractMatchingPasswords(pass));
    }

    public static ArrayList<String> extractMatchingPasswords(ArrayList<String> incomePassList) {
        //Start with a capital letter "A" or "B".
        //Followed by any 5 characters.
        //The 6th character is either "1," "3," or "7."
        //End with a "!".
        ArrayList<String> result = new ArrayList<>();
        for (String password:incomePassList){
            if (password.matches("^[AB].{5}[137]!")){
                result.add(password);
            }
        }
        return result;
    }
}
