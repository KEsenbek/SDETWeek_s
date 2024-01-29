package week5;

public class Class5_22_1 {

    private  String title;
    private  String author;
    private  String year;

    public static void main(String[] args) {

        Class5_22_1 object = new Class5_22_1();

        object.title = "Leonardo da Vinci";
        object.author = "Isaacson, Walter";
        object.year = "October 17, 2017";


        object.displayInfo();
    }
    public void displayInfo() {

        System.out.println("Title: "+ title);
        System.out.println("Author: "+ author);
        System.out.println("Year published: "+ year);}
}



