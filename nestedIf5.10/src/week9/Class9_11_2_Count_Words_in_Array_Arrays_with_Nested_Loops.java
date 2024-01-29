package week9;

public class Class9_11_2_Count_Words_in_Array_Arrays_with_Nested_Loops {
    public static void main(String[] args) {
        countWordsInArray(new String[]{"Hello, world!", "This is an example."});

    }

    public static int countWordsInArray(String[] array) {
        int wordCount = 0;
        for (String sentence : array) {
            int counter;
            if (sentence.equals("")) {
                counter = 0;
            } else {
                counter = 1;
                for (int i = 0; i < sentence.length(); i++) {
                    if (sentence.charAt(i) == ' ') {
                        counter++;
                    }
                }
                wordCount += counter;
            }

        }
        return wordCount;

    }


}
