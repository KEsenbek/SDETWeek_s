package week13;

public class Class13_2_2_Book_Overriding_OOP {
    public static void main(String[] args) {
// Test Book class
        System.out.println("Testing Book class:");
        Class<Book> bookClass = Book.class;
        System.out.println(bookClass);

// Test EBook class
        System.out.println("\nTesting EBook class:");
        Class<EBook> ebookClass = EBook.class;
        System.out.println(ebookClass);

        System.out.println();

        Book book1 = new Book();
        book1.title = "The Great Gatsby";
        book1.author = "F. Scott Fitzgerald";
        book1.price = 12.99;

        EBook ebook1 = new EBook();
        ebook1.title = "Pride and Prejudice";
        ebook1.author = "Jane Austen";
        ebook1.price = 9.99;
        ebook1.format = "PDF";

        System.out.println("Details of the Book:");
        book1.displayDetails();

        System.out.println("\nDetails of the EBook:");
        ebook1.displayDetails();
    }
}

class Book {
    String title;

    String author;

    double price;



    void displayDetails() {
        System.out.println("Title: "+title+"\n" +
                "Author: "+author+"\n" +
                "Price: $"+price);
    }


}

class EBook extends Book {
    String format;

    public EBook() {
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Format: "+format);
    }
}