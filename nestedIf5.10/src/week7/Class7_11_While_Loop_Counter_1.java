package week7;

import java.util.Scanner;

public class Class7_11_While_Loop_Counter_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String answer = sc.nextLine();

        int counter = 1;
        int i = 0;
        int j = 1;
        while (answer.length()-1>=j){
            i++;
            if (String.valueOf(answer.charAt(i)).equals(" ")) {
                counter++;

            }
                j++;
        }
        System.out.println("Number of words: "+counter);
    }
}
