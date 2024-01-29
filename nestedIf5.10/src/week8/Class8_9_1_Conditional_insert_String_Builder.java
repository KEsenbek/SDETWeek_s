package week8;

import java.util.Locale;

public class Class8_9_1_Conditional_insert_String_Builder {
    public static void main(String[] args) {
        String answer =  insertWords("this is without problems", "really ");

        System.out.println(answer);
    }

    public static String insertWords(String text, String word) {
    StringBuilder sb = new StringBuilder(text);

    String value = "is";

    int index = text.toLowerCase().indexOf(value.toLowerCase());

        if (index != -1){
            sb.insert(index+value.length(), "").insert(index + value.length()+1,word);
        }
        return sb.toString();
    }
}
