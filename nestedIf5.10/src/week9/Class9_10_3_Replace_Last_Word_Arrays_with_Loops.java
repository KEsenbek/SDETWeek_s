package week9;

import java.util.Arrays;

public class Class9_10_3_Replace_Last_Word_Arrays_with_Loops {
    public static void main(String[] args) {
        replaceLastWord(new String[]{"Hello World", "Java Code", "Test Results"},"WEDEVX");
    }

        public static String[] replaceLastWord(String[] sentences, String replacement) {

            StringBuilder sb = new StringBuilder();
            String[] text = new String[sentences.length];

            for (int i = 0; i< sentences.length;i++){
                String currentText = sentences[i];

                int index = currentText.lastIndexOf(' ');
               if (index != -1) {
                   String originalText = currentText.substring(index+1);
                  // System.out.println(originalText);
                   String modifyText = currentText.replace(originalText, replacement);
                  // System.out.println(modifyText);
                   text[i] = modifyText;
               }

            }
            System.out.println(Arrays.toString(text));
            return text;
        }
}
