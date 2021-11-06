package order;

import delivery.PostDeliveryStrategy;
import order.users.Receiver;
import order.users.Sender;
import org.junit.jupiter.api.Test;
import payment.CreditCardPaymentStrategy;

class OrderNotifierTest {

    @Test
    void notifyUsers(){
        Order order = Order.createNormalOrder(new CreditCardPaymentStrategy(), new PostDeliveryStrategy());
        Sender sender = new Sender();
        Receiver receiver = new Receiver();
        order.orderNotifier.addUser(sender);
        order.orderNotifier.addUser(receiver);
        order.orderNotifier.notifyUsers("Order was initiated.");
    }
}