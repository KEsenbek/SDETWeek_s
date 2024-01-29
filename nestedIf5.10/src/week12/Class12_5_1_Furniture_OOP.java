package week12;

public class Class12_5_1_Furniture_OOP {

    class Furniture{
        public String type;// Represents the type of furniture (e.g., chair, table).

        public double price;// Represents the price of the furniture.

        private String material;// Represents the material used to make the furniture.

        private String brand;// Represents the brand of the furniture.

        public Furniture(String type, double price, String material, String brand) {
            this.type = type;
            this.price = price;
            this.material = material;
            this.brand = brand;
        }

        public String getMaterial() {
            return material;
        }

        public String getBrand() {
            return brand;
        }
    }

}
