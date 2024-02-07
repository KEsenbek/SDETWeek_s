package week13;

public class Class13_4_2_Furniture_types_Methods_Polymorphism_OOP {
    public static void main(String[] args) {
        SofaBed sofaBed1 = new SofaBed("Convertible Sofa Bed", 599.99);
        SofaBed sofaBed2 = new SofaBed("Futon Sofa Bed", 399.99);
        SofaSet sofaSet1 = new SofaSet("Classic Sofa Set", 899.99);
        SofaSet sofaSet2 = new SofaSet("Modern Sofa Set", 1299.99);

        Sofa[] sofas = { sofaBed1, sofaBed2, sofaSet1, sofaSet2 };

        FurnitureStore furnitureStore = new FurnitureStore();
        double totalSofaPrice = furnitureStore.calculateTotalPrice(sofas);
        System.out.println("Total Sofa Price: $" + totalSofaPrice);
    }
}

class FurnitureStore{
    double calculateTotalPrice(Sofa[] sofas) {
        double totalPrice = 0.0;
        for (Sofa sofa:sofas) {
            totalPrice+=sofa.getPrice();
        }
        return totalPrice;
    }
}

class Sofa {
    String type;
    double price;

    public Sofa(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}

class SofaBed extends Sofa{
    public SofaBed(String type, double price) {
        super(type, price);
    }
}

class SofaSet extends  Sofa{
    public SofaSet(String type, double price) {
        super(type, price);
    }
}