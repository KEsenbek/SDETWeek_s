package week11;

import java.util.HashMap;
import java.util.Map;

public class Class11_5_2_Phone_Book_Search_Maps {
    public static void main(String[] args) {

        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("John Doe","123-456-7890");
        phoneBook.put("Alice Smith","987-654-3210");

        String name = "John Doe";

        searchContact(phoneBook,name);
    }

    public static String searchContact(Map<String, String> phoneBook, String name) {
        String answer = "";
    if (phoneBook.containsKey(name)) {
        answer = phoneBook.get(name);
    }else {
        answer = "Contact not found";
    }
        System.out.println(answer);
    return answer;
    }
}
