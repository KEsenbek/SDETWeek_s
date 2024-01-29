package week10;

import java.util.List;

public class Class10_11_3_Library_Catalog_Array_List {
    public static void main(String[] args) {
        List<String> books = List.of(new String[]{"Book 1", "Book 2", "Book 3"});
        String newBook = "Book 4";
        addBook(books,newBook);
    }

    public static List<String> addBook(List<String> books, String newBook) {
    books.add(newBook);
    return books;
    }
}
