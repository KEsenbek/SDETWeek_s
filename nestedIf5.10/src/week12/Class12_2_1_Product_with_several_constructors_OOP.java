package week12;

public class Class12_2_1_Product_with_several_constructors_OOP {

    class Product {

        String name;
        double price;
        int quantity;

        public Product() {
            name = "Unknown";
        }

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public Product(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }
    }
}
