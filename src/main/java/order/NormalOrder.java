package order;

import delivery.Delivery;
import payment.Payment;

public class NormalOrder extends Order{
    protected NormalOrder(Payment payment, Delivery delivery) {
        super(payment, delivery);
    }

    @Override
    public String getDescription() {
        return "This is normal order.";
    }
}
