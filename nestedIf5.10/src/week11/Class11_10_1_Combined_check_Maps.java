package week11;

import java.util.*;

public class Class11_10_1_Combined_check_Maps {
    public static void main(String[] args) {

        String sentence1 = "level eye Radar"; String sentence2 = "OpenAI language model";

        checkWords(sentence1, sentence2);
        // Returns { "level": true, "eye": true, "Radar": true, "OpenAI": true, "language": false, "model": false }
    }
    static Map<String, Boolean> checkWords(String s1, String s2) {
        String[] s1Split = s1.split(" ");
        String[] s2Split = s2.split(" ");
        Map<String, Boolean> map1 = new TreeMap<>();
        Map<String, Boolean> map2 = new TreeMap<>();
        for (int i = 0; i < s1Split.length; i++) {
            boolean answer = true;
            for (int j = 0; j < s1Split[i].length(); j++) {
                if (!String.valueOf(s1Split[i].charAt(j)).equalsIgnoreCase(String.valueOf(s1Split[i].charAt(s1Split[i].length() - 1 - j)))) {
                    answer = false;
                }
            }
            map1.put(s1Split[i], answer);
        }
        for (String word : s2Split) {
            boolean isUpperCase = Character.isUpperCase(word.charAt(0));
            map2.put(word, isUpperCase);
        }
        map1.putAll(map2);
        return map1;
    }
//    public static Map<String,Boolean> checkWords(String sentence1, String sentence2) {
//        Map<String,Boolean> answerSentence1 = new HashMap<>();
//        Map<String,Boolean> answerSentence2 = new HashMap<>();
//
//        ArrayList<String> palindrome  = new ArrayList<>(List.of(sentence1.split(" ")));
//        String[] capitalLetter = sentence2.split(" ");
//
//                for (String word : palindrome) {
//                    int left = 0;
//                    int right = word.length() - 1;
//
//
//                    while (left < right) {
//                        if (word.charAt(left) != word.charAt(right)) {
//
//                            answerSentence1.put(word,false);
//                            break;
//                        }
//                        left++;
//                        right--;
//                    }
//                    answerSentence1.put(word,true);
//
//                }
//
//        for (String words: capitalLetter) {
//            //System.out.println(words.charAt(0));
//            if (Character.isUpperCase(words.charAt(0))){
//                answerSentence2.put(words,true);
//            }else {
//                answerSentence2.put(words,false);
//            }
//        }
//
//
////        System.out.println(answerSentence1);
////        System.out.println(answerSentence2);
//        answerSentence1.putAll(answerSentence2);
//        return answerSentence1;
//    }
}
