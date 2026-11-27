package zad3;

public class Account {

    // balance nie powinno być wprost ustawiane
    // lepszym podejściem jest modyfikacja przez deposit
    private double balance = 0; // pole balance powinno byc prywatne
    private String owner; // owner odnosi się do konkretnego obiektu account, static jest błędem
    public Account(String owner) {
        this.owner = owner;
        // słowo kluczowe this wymagane w celu rozróznienia zmiennych od pól
    }

    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    // deposit odnosi się do konkretnego konta, static jest błędem
    public void deposit(double amount) {
        if(amount > 0){
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if(amount > 0 && amount <= this.balance){
            this.balance -= amount;
        }
    }
    // withdraw dodane w celu przywrócenia funkcjonalności przy poprawionej heremtyzacji
}
