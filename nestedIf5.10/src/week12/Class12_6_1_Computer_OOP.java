package week12;

public class Class12_6_1_Computer_OOP {
    public static void main(String[] args) {

    }

    class Computer{
        private String brand;// Represents the brand of the computer (e.g., Dell, HP).

        private String model;// Represents the model of the computer.

        private int year;// Represents the manufacturing year of the computer.

        private double price;// Represents the price of the computer.

        public Computer(String brand, String model, int year, double price) {
            this.brand = brand;
            this.model = model;
            this.year = year;
            this.price = price;
        }

        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        public int getYear() {
            return year;
        }

        public double getPrice() {
            return price;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }
}
