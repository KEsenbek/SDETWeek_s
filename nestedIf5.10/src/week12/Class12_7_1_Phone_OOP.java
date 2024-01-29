package week12;

public class Class12_7_1_Phone_OOP {
    public static void main(String[] args) {

    }
}
class Phone {
    private String brand;// Represents the brand of the phone.

    private String model;// Represents the model of the phone.

    private int price;// Represents the price of the phone.

    public Phone() {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        if (brand != null && !brand.isEmpty()) {
            this.brand = brand;
        }
    }

    public void setModel(String model) {
        if (model != null && !model.isEmpty()) {
            this.model = model;
        }
    }

    public void setPrice(int price) {
        if (price >= 0) {
            this.price = price;
        }
    }
        public void displayPhoneDetails() {
            System.out.println("Brand: " + brand + ", Model: " + model + ", Price: " + price);
        }

        public void call (String phoneNumber){
            System.out.println("Calling " + phoneNumber);
        }

        public void sendMessage (String phoneNumber, String message){
            System.out.println("Sending message to " + phoneNumber + ": " + message);
        }

        public void increasePrice ( int amount){
            if (amount >= 0) {
                price += amount;
                System.out.println("Price increased by " + amount);
            } else {
                System.out.println("Invalid amount");
            }
        }

}