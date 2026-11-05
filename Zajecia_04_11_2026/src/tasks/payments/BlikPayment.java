package tasks.payments;

public class BlikPayment extends Payment{
    public BlikPayment(String type) {
        super(type);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Płatność BLIK: " + amount);
    }
}
