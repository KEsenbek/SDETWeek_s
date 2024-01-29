package week9;

public class Class9_10_2_Find_Last_Word_Length_Arrays_with_Loops {
    public static void main(String[] args) {
        findLastWordLength(new String[]{"Hello World", "Java Code", "Test Results"});

    }

    public static int findLastWordLength(String[] strings) {

        String word = "";
        int sum = 0;
        int index = 0;

        for (int i = 0; i<strings.length; i++){

            word = strings[i];

            index = word.indexOf(' ')+1;
            String lastWord = word.substring(index);
            sum+=lastWord.length();
        }
        return sum;
    }
}
