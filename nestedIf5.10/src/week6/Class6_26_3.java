package week6;



public class Class6_26_3 {
    //Create a Java program that includes a static method named countWhitespaces()
    // to count the total number of whitespace characters ( ) within a given sentence.
    // The program should take a sentence as String parameter,
    // calculate and return the count of whitespace characters as int.
    //Ensure that the method countWhitespaces() makes use of the trim()
    // method to remove any leading and trailing spaces, ensuring accurate
    // counting of spaces within the sentence. Consider handling long sentences with multiple spaces between words.
    //Example #1:
    //Parameters:
    //String sentence = "      There are many spaces here.  "
    //Return: int
    //4
    public static void main(String[] args) {
        int value = countWhitespaces("      There are many spaces here.  ");
        System.out.println(value);
    }

    public static int countWhitespaces(String text) {

        String value = text.trim();
        int leng1 = value.length();
        String repl = value.replaceAll("\\s+","");
            int leng2 = repl.length();
        int answer = leng1 - leng2;

        return answer;
    }
}
