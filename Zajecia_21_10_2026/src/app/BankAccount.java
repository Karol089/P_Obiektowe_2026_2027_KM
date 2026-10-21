package app;

public class BankAccount {
    private String owner;
    private double balance = 0.0;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public BankAccount(String owner) {
        this.owner = owner;
    }

    public BankAccount() {
        this("Unknown");
    }

    public void showInfo(){
        System.out.printf("Owner: %s \nBalance: %.2f \n\n", this.owner, this.balance);
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setOwner(String owner) {
        if(owner != null && !owner.isBlank()) {
            this.owner = owner;
        }
    }

    public void deposit(double value){
        if(value > 0){
            this.balance += value;
        }
    }

    public void withdraw(double value){
        if(value > 0 && value <= balance){
            this.balance -= value;
        }
    }
}
