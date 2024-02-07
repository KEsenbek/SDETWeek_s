package week13;

import java.util.Objects;

public class Class13_8_1_Book_comparison_HashCode_and_Equals_Methods_In_Java {
    public static void main(String[] args) {
        Book1 book1 = new Book1("To Kill a Mockingbird", "Harper Lee", 1960, "Classic Fiction");
        Book1 book2 = new Book1("to kill a mockingbird", "harper lee", 1960, "classic fiction");
        Book1 book3 = new Book1("1984", "George Orwell", 1949, "Dystopian Fiction");

        System.out.println("Comparing book1 and book2: " + book1.equals(book2));
        System.out.println("Comparing book1 and book3: " + book1.equals(book3));
        System.out.println("Hash code of book1: " + book1.hashCode());
        System.out.println("Hash code of book2: " + book2.hashCode());
        System.out.println("Hash code of book3: " + book3.hashCode());
    }
}

class Book1 {
    int lastId;
    int id;
    String title;
    String author;
    int year;
    String genre;

    public Book1(String title, String author, int year, String genre) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book1 book1 = (Book1) o;
        return year == book1.year && Objects.equals(title.toLowerCase(),
                book1.title.toLowerCase()) && Objects.equals(author.toLowerCase(),
                book1.author.toLowerCase()) && Objects.equals(genre.toLowerCase(), book1.genre.toLowerCase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(title.toLowerCase(), author.toLowerCase(),genre.toLowerCase() ,year);
    }
}