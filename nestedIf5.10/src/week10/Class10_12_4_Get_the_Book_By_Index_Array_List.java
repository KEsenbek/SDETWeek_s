package week10;

import java.util.List;

public class Class10_12_4_Get_the_Book_By_Index_Array_List {
    public static void main(String[] args) {
        List<String> books = List.of(new String[]{"Book 1", "Book 2", "Book 3", "Book 4", "Book 5"});
        int bookIndex = 3;
        getBook(books,bookIndex);
    }

    public static String getBook(List<String> books, int bookIndex) {
        if (bookIndex<0) {
            return "-1";
        }

        String answer = books.get(bookIndex);
        return answer;
    }
}
