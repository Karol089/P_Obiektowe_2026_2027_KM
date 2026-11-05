package tasks.payments;

public class Payment {

    private String type;

    public Payment(String type) {
        this.type = type;
    }

    public void pay(double amount) {
        System.out.println("Płatność: " + amount);
    }
}
