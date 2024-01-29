package week5;

import java.util.Scanner;

public class Class5_13_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the quantity of the product:");
        double quantityProduct = sc.nextDouble();
        double price = quantityProduct;
        if (quantityProduct>0 ) {
            System.out.println("Enter the location of the customer (USA/Canada/Other):");
            String location = sc.next();
            if (quantityProduct > 0 && quantityProduct < 100) {
                if (location.equals("USA")) {
                    price *= 2.50;
                    System.out.printf("The total cost of the product is: $%.1f", price);
                } else if (location.equals("Canada")) {
                    price *= 3.00;
                    System.out.printf("The total cost of the product is: $%.1f", price);
                } else if (location.equals("Other")) {
                    price *= 3.50;
                    System.out.printf("The total cost of the product is: $%.1f", price);
                }else {
                    System.out.println("Invalid location");
                }
            } else if (quantityProduct >= 100) {
                if (location.equals("USA")) {
                    price *= 2.00;
                    System.out.printf("The total cost of the product is: $%.1f", price);
                } else if (location.equals("Canada")) {
                    price *= 2.50;
                    System.out.printf("The total cost of the product is: $%.1f", price);
                } else if (location.equals("Other")) {
                    price *= 3.00;
                    System.out.printf("The total cost of the product is: $%.1f", price);
                }else {
                    System.out.println("Invalid location");
                }
            }
        }else {
            System.out.println("Quantity cannot be 0 or less");
        }
    }
}
