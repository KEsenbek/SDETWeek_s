package week13;

import java.util.*;

public class Class13_8_2_IceCream_HashCode_and_Equals_Methods_In_Java {
    public static void main(String[] args) {
        List<String> ingredients1 = Arrays.asList("chocolate", "caramel", "nuts");
        List<String> ingredients2 = Arrays.asList("vanilla", "strawberry", "chocolate");
        List<String> ingredients3 = Arrays.asList("mint", "chocolate chips", "fudge");
        List<String> ingredients4 = Arrays.asList("caramel", "chocolate", "nuts");
        List<String> ingredients5 = Arrays.asList("chocolate", "nuts", "caramel");
        List<String> ingredients6 = Arrays.asList("chocolate", "fudge", "chocolate chips");

        IceCreamFlavor flavor1 = new IceCreamFlavor("Choco Caramel Crunch", "chocolate", ingredients1);
        IceCreamFlavor flavor2 = new IceCreamFlavor("Chocolate Swirl", "chocolate", ingredients2);
        IceCreamFlavor flavor3 = new IceCreamFlavor("Mint Chocolate Chip", "chocolate", ingredients3);
        IceCreamFlavor flavor4 = new IceCreamFlavor("Caramel Delight", "chocolate", ingredients4);
        IceCreamFlavor flavor5 = new IceCreamFlavor("Caramel Delight", "chocolate", ingredients5);
        IceCreamFlavor flavor6 = new IceCreamFlavor("Chocolate Dream", "chocolate", ingredients6);

        System.out.println("Flavor 1 hash code: " + flavor1.hashCode());
        System.out.println("Flavor 2 hash code: " + flavor2.hashCode());
        System.out.println("Flavor 3 hash code: " + flavor3.hashCode());
        System.out.println("Flavor 4 hash code: " + flavor4.hashCode());
        System.out.println("Flavor 5 hash code: " + flavor5.hashCode());
        System.out.println("Flavor 6 hash code: " + flavor6.hashCode());

        System.out.println("Flavor 1 equals Flavor 2: " + flavor1.equals(flavor2));
        System.out.println("Flavor 1 equals Flavor 3: " + flavor1.equals(flavor3));
        System.out.println("Flavor 4 equals Flavor 5: " + flavor4.equals(flavor5));
        System.out.println("Flavor 4 equals Flavor 6: " + flavor4.equals(flavor6));
        System.out.println("Flavor 5 equals Flavor 6: " + flavor5.equals(flavor6));

    }
}
class IceCreamFlavor{
    int id;
    String name;
    String base;
    List<String> ingredients;

    public IceCreamFlavor(String name, String base, List<String> ingredients) {
        this.name = name;
        this.base = base;
        this.ingredients = ingredients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IceCreamFlavor)) return false;
        IceCreamFlavor that = (IceCreamFlavor) o;

        boolean nameEqual = this.name.equalsIgnoreCase(that.name);
        boolean baseEqual = this.base.equalsIgnoreCase(that.base);

        List<String> ingredientsSort1 = new ArrayList<>(this.ingredients);
        List<String> ingredientsSort2 = new ArrayList<>(that.ingredients);
        Collections.sort(ingredientsSort1);
        Collections.sort(ingredientsSort2);

        return nameEqual && baseEqual && ingredientsSort1.equals(ingredientsSort2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, base, ingredients);
    }
}