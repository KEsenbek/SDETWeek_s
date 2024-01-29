package week9;

public class Class9_11_1_Vowel_Counter_in_Array_Arrays_with_Nested_Loops {
    public static void main(String[] args) {
      int answer =  countVowelsInArray(new String[]{"Hello", "world", "AI"});

        System.out.println(answer);
    }


    public static int countVowelsInArray(String[] strings) {

        int counter = 0;
        for (int i = 0; i<strings.length; i++) {

            String word = strings[i];

            for (int j = 0; j<word.length(); j++) {
                String value = word.toUpperCase();
                if (value.charAt(j) == 'A' || value.charAt(j) == 'E' || value.charAt(j) == 'I' ||
                value.charAt(j) == 'O' || value.charAt(j) == 'U') {
                    counter++;
                }
            }


        }
        return counter;

    }
}
