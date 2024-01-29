package week12;

import java.util.*;
public class Class12_15_1_Platform_for_E_commerce_OOP {
    public static void main(String[] args) {

    }
}

class Product{
    private static int nextId = 1;// Represents the next productId and increases on each Product object creation. Default value is 1.

    private int productId;// Represents the product id of the Product.

    private String name;// Represents the name of the Product.

    private double price;// Represents the price of the Product.

    public Product(String name, double price) {
        this.name = name;
        setPrice(price);
        this.productId = nextId++;
    }

    public int getProductId() {
        return productId;
    }


    public String getName() {
        return name;
    }



    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price>=0) {
            this.price = price;
        }else {
            System.out.println("Invalid price. Price cannot be negative.");
        }
    }

    public void setName(String name) {
        this.name = name;
    }
}


class  Customer{
    private static int nextId = 1;// Represents the next customerId and increases on each Customer object creation. Default value is 1.

    private int customerId;// Represents the customer id of the Customer.

    private String name;// Represents the name of the Customer.

    private String email;// Represents the email of the Customer.

    public Customer(String name, String email) {
        this.name = name;
        setEmail(email);
        this.customerId=nextId++;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email){
        if(email.matches(".+@.+\\..+")){
            this.email=email;
        }else{
            System.out.println("Invalid email format.");
        }
    }
}

class Order{
    private static int nextId =1; //Represents the next orderId and increases on each Order object creation. Default value is 1.

    private int orderId;// Represents the order id of the Order.

    private Customer customer;// Represents the customer in the Order.

    private ArrayList<Product> products;// Represents the products in the Order.

    public Order(Customer customer) {
        this.customer = customer;
        this.products = new ArrayList<>();
        this.orderId = nextId;
        nextId++;
    }


    public void addProduct(Product product) {
        products.add(product);
    }

    public double getTotalPrice(){
        double sum = 0;
        for (Product product:products){

            sum+=product.getPrice();
        }
        return sum;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer=customer;
    }

}