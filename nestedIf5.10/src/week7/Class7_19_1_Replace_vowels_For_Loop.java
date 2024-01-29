package week7;

public class Class7_19_1_Replace_vowels_For_Loop {
    public static void main(String[] args) {
        replaceVowels("Hello, World!");
    }

    public static String replaceVowels(String text) {

        if(text.trim().isEmpty()){
            return "";
        }
        String answer = "";

        for (int i = 0; i<=text.length()-1;i++){

            if (String.valueOf(text.charAt(i)).equalsIgnoreCase("a") || String.valueOf(text.charAt(i)).equalsIgnoreCase("e") ||String.valueOf(text.charAt(i)).equalsIgnoreCase("i") ||String.valueOf(text.charAt(i)).equalsIgnoreCase("o") ||String.valueOf(text.charAt(i)).equalsIgnoreCase("u")){
                answer+=String.valueOf(text.charAt(i)).replaceAll(String.valueOf(text.charAt(i)),"*");


            }else {
                answer+=(text.charAt(i));
            }
        }

        return answer;
    }
}
