package week6;

public class Class6_24_1 {

    //Description: Write a Java static method called extractSubstringAfterWord()
    // that reads a sentence from the user and extracts a substring after a given word.
    //Param: The method should take two inputs:
    //A string representing the sentence to be analyzed.
    //A string representing the word after which the substring should be extracted.
    //Return: The method should return a string that represents the substring after the given word in the input sentence.
    //Task: The method should search for the given word in the input sentence, and if it is found, extract the substring
    // after it. If the word is not found, the method should return an empty string.
    public static void main(String[] args) {
       String answer =  extractSubstringAfterWord("I love programming and coding", "programming");
        System.out.println(answer);


    }

    public static String extractSubstringAfterWord(String text, String value) {
        int num = text.indexOf(value);
            if(num == -1) {
                return "";
            }else {
        String result  = text.substring(num + value.length());
        return result;}
    }
}
