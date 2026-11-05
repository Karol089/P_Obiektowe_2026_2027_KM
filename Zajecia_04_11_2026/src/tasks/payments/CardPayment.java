package tasks.payments;

public class CardPayment extends Payment {
    public CardPayment(String type) {
        super(type);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Płatność kartą: " + amount);
    }
}
