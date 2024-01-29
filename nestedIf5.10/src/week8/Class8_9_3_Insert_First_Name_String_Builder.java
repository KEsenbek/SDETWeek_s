package week8;

import java.util.Scanner;

public class Class8_9_3_Insert_First_Name_String_Builder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.println("Enter your last name:");
        sb = new StringBuilder(sc.nextLine());
        System.out.println("Enter your first name:");
        sb.insert(0, " ").insert(0,sc.nextLine());

        System.out.println(sb);
    }
}
