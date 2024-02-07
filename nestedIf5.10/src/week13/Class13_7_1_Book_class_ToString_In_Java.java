package week13;

public class Class13_7_1_Book_class_ToString_In_Java {
    public static void main(String[] args) {
        Books book1 = new Books("To Kill a Mockingbird", "Harper Lee", 1960, "Classic Fiction");
        Books book2 = new Books("1984", "George Orwell", 1949, "Dystopian Fiction");

        System.out.println(book1.toString());
        System.out.println(book2.toString());
    }
}
class Books{
    String title;
    String author;
    int year;
    String genre;

    public Books(String title, String author, int year, String genre) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
    }

        @Override
        public String toString() {
            return  "Title: " + title + "\n" +
                    "Author: " + author + "\n" +
                    "Publication Year: " + year + "\n"+
                    "Genre: " + genre;
        }


}