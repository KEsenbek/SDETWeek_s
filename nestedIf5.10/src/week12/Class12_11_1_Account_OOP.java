package week12;

import java.util.ArrayList;
import java.util.List;

public class Class12_11_1_Account_OOP {
    public static void main(String[] args) {

        Account ac = new Account("123", List.of(new String[]{"Mama"}));

        System.out.println(ac.getAccountHolders());
    }
}

class Account {

    static final String bankName = "XYZ Bank";// Represents the name of the bank where the account is held. Initialize the default value "XYZ Bank" of the bankName variable
    static int totalAccounts = 0;

    String accountNumber;// Represents the account number.
    List<String> accountHolders = new ArrayList<>();// Represents the list of account holders.
    List<Double> transactions;// Represents the list of transactions made on the account.

    public Account(String accountNumber, List<String> accountHolders) {
        this.accountNumber = accountNumber;
        this.accountHolders = accountHolders;
        this.transactions = new ArrayList<>();
        totalAccounts++;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public List<String> getAccountHolders() {
        return accountHolders;
    }

    public List<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double amount) {
        transactions.add(amount);
    }

    public double getBalance(){
        double sum = 0;
        for (double transaction: transactions) {
            sum+=transaction;
        }
        return sum;
    }

    public boolean hasAccountHolder(String accountHolder){
        if (accountHolders.contains(accountHolder)) {
            return true;
        }
        else {
            return false;
        }
    }
}