package week8;

import java.util.Scanner;

public class Class8_10_1_Email_Template_Builder_String_Builder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        StringBuilder sb = new StringBuilder(name);
        sb.append("@").append(sc.nextLine());

        System.out.println(sb);
    }
}
