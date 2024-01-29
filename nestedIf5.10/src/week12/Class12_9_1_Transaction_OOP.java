package week12;

public class Class12_9_1_Transaction_OOP {
    public static void main(String[] args) {

    }
}
class Transaction {
    private static int transactionCount = 0;
    private static String bankName = "Default Bank";

    private String transactionId;
    private String accountNumber;
    private double amount;
    private boolean isSuccessful;

    // Constructor
    public Transaction(String accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.transactionId = "T" + (++transactionCount);
        this.isSuccessful = false;
    }

    // Static Methods
    public static String getBankName() {
        return bankName;
    }

    public static void setBankName(String name) {
        bankName = name;
    }

    public static double calculatePercentage(double percentage, Transaction transaction) {
        if (transaction.isSuccessful) {
            return (percentage / 100) * transaction.amount;
        } else {
            return 0;
        }
    }

    public static int getTransactionCount() {
        return transactionCount;
    }

    // Instance Methods
    public void processTransaction() {
        int transactionIdNumber = Integer.parseInt(transactionId.substring(1));
        isSuccessful = (transactionIdNumber % 2 == 0);
    }

    public void displayTransactionDetails() {
        System.out.println("Transaction Details:");
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Amount: $" + amount);
        System.out.println("Successful: " + isSuccessful);
    }

}