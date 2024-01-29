package week9;

public class Class9_6_5_Student_Grade_Book_Arrays_with_Loops {
    public static void main(String[] args) {
        displayGrades(new String[]{"John", "Alice", "Bob"}, new double[]{85.5, 92.0, 78.5});
    }

    public static void displayGrades(String[] names, double[] grades) {

        int j = 1;
        for (int i = 0; i<names.length;i++) {

            System.out.println(j+". "+names[i]+" - "+grades[i]);
            j++;
        }
    }
}
