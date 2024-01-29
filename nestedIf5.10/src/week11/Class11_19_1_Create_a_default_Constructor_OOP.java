package week11;

public class Class11_19_1_Create_a_default_Constructor_OOP {


        public String cardNumber;// Represents the credit card number.

        public String cardHolderName;// Represents the name of the cardholder.

        public double creditLimit;// Represents the maximum credit limit on the card.

        public double currentBalance;// Represents the current balance on the card.

        public boolean isBlocked;// Represents whether the card is blocked or not.

        public Class11_19_1_Create_a_default_Constructor_OOP() {
            System.out.println("Hello from Constructor.");
        }
    }

    class Main2 {
        public static void main(String[] args) {
            Class11_19_1_Create_a_default_Constructor_OOP var = new Class11_19_1_Create_a_default_Constructor_OOP();
        }
    }

