package tasks.payments;

public class TransferPayment extends Payment {
    public TransferPayment(String type) {
        super(type);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Przelew: " + amount);
    }
}
