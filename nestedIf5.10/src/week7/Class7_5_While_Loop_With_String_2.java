package week7;

import java.util.Scanner;

public class Class7_5_While_Loop_With_String_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int columns = sc.nextInt();
        int rows = sc.nextInt();
        String answer = repeatString(str,columns,rows);
        System.out.println(answer);
    }

    public static String repeatString(String str, int columns, int rows) {

        String value = "";
        int i = 1;

        while (rows>i) {

            int j = 1;
            while (columns>=j) {
                    value+=str;
                    j++;
                }
            value += "\n";
            i++;
        }
        return value;
    }
}
