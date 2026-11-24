package tasks.payments;

import tasks.interfaces.PaymentMethod;

public class OrderService {
    private PaymentMethod paymentMethod;

    public OrderService(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void checkOut(double amount){
        this.paymentMethod.pay(amount);
    }
}
