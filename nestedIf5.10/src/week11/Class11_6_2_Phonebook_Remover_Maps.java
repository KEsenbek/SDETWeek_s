package week11;

import java.util.HashMap;
import java.util.Map;

public class Class11_6_2_Phonebook_Remover_Maps {
    public static void main(String[] args) {
        Map<String, String> phonebook = new HashMap<>();
        phonebook.put("Alice", "123-456-7890");
        phonebook.put("Bob", "987-654-3210");
        phonebook.put("Charlie", "555-123-4567");
        String deleteContact = "Bob";

        removePhonebookEntry(phonebook,deleteContact);
    }

    public static Map<String,String> removePhonebookEntry(Map<String, String> phonebook, String deleteContact) {

        Map<String,String> answers = new HashMap<>(phonebook);

        answers.remove(deleteContact);

        //System.out.println(answers);
        return answers;

    }
}
