package tasks.payments;

import tasks.interfaces.PaymentMethod;

public class TransferPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.printf("Paid %.2f using transfer.\n", amount);
    }
}
