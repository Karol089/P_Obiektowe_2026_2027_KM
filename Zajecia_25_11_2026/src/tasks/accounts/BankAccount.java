package tasks.accounts;

public class BankAccount {
    private String owner;
    private double balance = 0;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public BankAccount(String owner) {
        this(owner, 0.0);
    }

    public class Transaction {
        private String description;
        private double amount;

        public Transaction(String description, double amount) {
            this.description = description;
            this.amount = amount;
        }

        public void print(){
            System.out.printf("Account owner: %s \nTransaction details: %s \nValue: %.2f \n",
                    BankAccount.this.owner, this.description, this.amount);
        }
    }
}
