package week10;

import java.util.ArrayList;

public class Class10_14_1_Update_cart_Array_List {
    public static void main(String[] args) {
        ArrayList<String> texts = new ArrayList<>();
        texts.add("sentence");
        texts.add("work");
        texts.add("table");
        texts.add("keyboard");
        texts.add("run");
        texts.add("program");
        texts.add("word");
        texts.add("dawn");

        String haveWord = "word";
        String newWord = "sword";
       ArrayList<String> ans =  updateCart(texts, haveWord, newWord);
        System.out.println(ans);

    }

    public static ArrayList<String> updateCart(ArrayList<String> texts, String haveWord, String newWord) {
        ArrayList<String> answer = texts;
        int counter = 0;
        for (int i = 0; i< answer.size();i++) {

            if (answer.get(i).equalsIgnoreCase(haveWord)) {
                answer.set(counter,newWord);
            }
            counter++;
        }
        return answer;
    }
}
