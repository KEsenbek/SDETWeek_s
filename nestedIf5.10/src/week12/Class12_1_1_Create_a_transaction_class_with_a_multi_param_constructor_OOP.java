package week12;

public class Class12_1_1_Create_a_transaction_class_with_a_multi_param_constructor_OOP {
    class Transaction{
        public String transactionId;
        public String senderAccount;
        public String receiverAccount;
        public double amount;

        public Transaction(String transactionId, String senderAccount, String receiverAccount, double amount) {
            this.transactionId = transactionId;
            this.senderAccount = senderAccount;
            this.receiverAccount = receiverAccount;
            this.amount = amount;
        }
    }
}
