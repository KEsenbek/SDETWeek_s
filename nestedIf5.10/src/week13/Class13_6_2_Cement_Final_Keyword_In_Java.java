package week13;

public class Class13_6_2_Cement_Final_Keyword_In_Java {
    public static void main(String[] args) {

    }
}

class CementBag {
    private String productName;
    private double price;

    public CementBag(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Brand: "+productName+"\n" +
                "Price per Bag: $"+price);
    }

    public void use(){
        System.out.println("Usage instructions: Mix with water and other materials for construction.");
    }
}

class ConcreteMix {
    private String productName;
    private  double price;
    private String grade;

    public ConcreteMix(String productName1, double price1, String grade) {

        this.productName = productName1;
        this.price = price1;
        this.grade = grade;
    }


    public void displayInfo() {
        System.out.println("Brand: "+productName+"\n" +
                "Price per Bag: $"+price + "\nStrength Grade: "+grade);

    }


    public void use() {
        System.out.println("Usage instructions: Mix with water and other materials for construction.");
    }
}