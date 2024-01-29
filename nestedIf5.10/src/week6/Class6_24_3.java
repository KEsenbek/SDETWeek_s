package week6;

public class Class6_24_3 {
    //Description: Write a static method called extractBetween2Words() that reads a sentence from the
    // user and extracts a substring between two given words.
    //3 Params:
    //A string representing the sentence.
    //A string representing the starting word of the desired substring
    //A string representing the ending word of the desired substring.
    //Return:
    //A string representing the extracted substring. Both starting and ending words should be excluded from the final String.
    //if the ending word is not found, return the String from starting word till the end of the String
    //if the starting word is not found, return the from the String from the beginning(index 0) till the ending word
    //if both starting and ending words are not found then return "Invalid input, starting word and ending words not found"

    public static void main(String[] args) {
       String anw =  extractBetween2Words("I like to eat pizza", "meet" , "home");
        System.out.println(anw);


    }

    public static String extractBetween2Words(String sentence, String startingWord, String endingWord) {

            int startIndex = sentence.indexOf(startingWord);
            int endIndex;

            if (startIndex != -1) {
                // Starting word found
                startIndex += startingWord.length();
                endIndex = sentence.indexOf(endingWord, startIndex);

                if (endIndex != -1) {
                    // Ending word found
                    return sentence.substring(startIndex, endIndex);
                } else {
                    // Ending word not found, return from starting word till the end
                    return sentence.substring(startIndex);
                }
            } else {
                // Starting word not found
                endIndex = sentence.indexOf(endingWord);

                if (endIndex != -1) {
                    // Ending word found, return from the beginning till the ending word
                    return sentence.substring(0, endIndex);
                } else {
                    // Both starting and ending words not found
                    return "Invalid input, starting word and ending words not found";
                }
            }
        }
    }

