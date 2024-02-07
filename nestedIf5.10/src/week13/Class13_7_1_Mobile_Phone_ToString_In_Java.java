package week13;

public class Class13_7_1_Mobile_Phone_ToString_In_Java {
    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S21", 999.99, 2021);
        MobilePhone phone2 = new MobilePhone("Apple", "iPhone 12", 1099.99, 2021);

        System.out.println(phone1.toString());
        System.out.println(phone2);
    }
}

class MobilePhone {
    int lastId;
    int id;
    String brand;
    String model;
    double price;
    int year;

    public MobilePhone(String brand, String model, double price, int year) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.year = year;
    }

    @Override
    public String toString() {
        return "MobilePhone: {brand="+brand+", model="+model+", price="+price+"$, year="+year+"}";
    }
}