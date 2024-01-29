package week10;

import java.util.ArrayList;
import java.util.List;

public class Class10_10_1_Simple_ArrayList_creation_Array_List {
    public static void main(String[] args) {
        String text = "Hello 123 World!";
        List<String> ans   = addToList(text);
        System.out.println(ans);
    }

    public static List<String> addToList(String text) {

        List<String> answer = new ArrayList<>();

        answer.add(text);
        return answer;
    }
}
