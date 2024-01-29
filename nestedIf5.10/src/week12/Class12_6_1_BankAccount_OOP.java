package week12;

public class Class12_6_1_BankAccount_OOP {
    public static void main(String[] args) {

    }

    class BankAccount{
        private String accountName;// Represents the name of the account holder.

        private double initialDeposit;// Represents the initial deposit amount in the account.

        private String openingDate;// Represents the date when the account was opened in the format "dd-MM-yyyy".

        public BankAccount(String accountName, double initialDeposit, String openingDate) {
            this.accountName = accountName;
            this.initialDeposit = initialDeposit;
            this.openingDate = openingDate;
        }

        public String getAccountName() {
            return accountName;
        }

        public double getInitialDeposit() {
            return initialDeposit;
        }

        public String getOpeningDate() {
            return openingDate;
        }

        public void setAccountName(String accountName) {
            if (accountName.length()>3) {
            this.accountName = accountName;
            }else {
                System.out.println("Account name must be at least 3 characters long");
            }
        }

        public void setInitialDeposit(double initialDeposit) {
            if (initialDeposit>25.00) {
                this.initialDeposit = initialDeposit;
            }else {
                System.out.println("Initial deposit must be at least $25.00");
            }
        }

        public void setOpeningDate(String openingDate) {
            this.openingDate = openingDate;
        }
    }
}
