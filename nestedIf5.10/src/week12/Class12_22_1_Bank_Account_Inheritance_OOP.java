package week12;

public class Class12_22_1_Bank_Account_Inheritance_OOP {
    public static void main(String[] args) {

    }
}

class BankAccount {
    protected String accountNumber;
    protected double balance;
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        System.out.printf("Initial balance for %s is %s%n", getAccountNumber(), balance);
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.printf("Top up %s for %s. %s available%n", getAccountNumber(), amount, getBalance());
    }
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.printf("Available balance for %s is %s%n", getAccountNumber(), getBalance());
        } else {
            System.out.println("Insufficient funds");
        }
    }
    public double getBalance() {
        return balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
}
class SavingsAccount extends BankAccount {
    private double interestRate;
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    public void calculateInterest() {
        double interest = balance * interestRate/100;
        deposit(interest);
    }
}
class CheckingAccount extends BankAccount {
    double overdraftLimit;
    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber,balance);
        this.overdraftLimit = overdraftLimit;
    }
    public void withdrawWithOverdraft(double amount) {
        if(amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.printf("Balance for %s is %s%n", getAccountNumber(), getBalance());
        } else {
            System.out.println("Insufficient funds");
        }
    }
}