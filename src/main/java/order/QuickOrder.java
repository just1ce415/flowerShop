package order;

import delivery.Delivery;
import payment.Payment;

public class QuickOrder extends Order{
    protected QuickOrder(Payment payment, Delivery delivery) {
        super(payment, delivery);
    }

    @Override
    public String getDescription() {
        return "This is quick order.";
    }
}
