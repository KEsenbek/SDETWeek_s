package week8;

import java.util.Scanner;

public class Class8_10_2_Sentence_Concatenation_Challenge_String_Builder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        StringBuilder sb = new StringBuilder(text);
        sb.append(sc.nextLine());

        System.out.println(sb);
    }
}
