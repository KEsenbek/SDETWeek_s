package week6;

public class Class6_23_4 {

    ///Create a Java program that implements a "Text Highlighter" tool.
    // The program should take two inputs: a text as a String and a
    // substring as a String to highlight. Implement a static method
    // named highlightText() that searches for all occurrences of the
    // specified word in the text document and encloses them in <span></span> HTML tags (e.g. <span>some text</span>).

    public static void main(String[] args) {
        highlightText("Java is a versatile programming language. Java is widely used for web development.", "Java");
    }

    public static String highlightText(String text,String input) {

        String value = text.replace (input, "<span>" + input+ "</span>");

        return  value;
    }
}
