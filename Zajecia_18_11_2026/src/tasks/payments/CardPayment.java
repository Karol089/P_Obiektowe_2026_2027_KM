package tasks.payments;

import tasks.interfaces.PaymentMethod;

public class CardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.printf("Paid %.2f using car.\n", amount);
    }
}
