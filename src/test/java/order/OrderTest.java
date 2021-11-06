package order;

import delivery.DHLDeliveryStrategy;
import delivery.PostDeliveryStrategy;
import flower_units.Flower;
import flower_units.enums.Color;
import flower_units.enums.FlowerType;
import org.junit.jupiter.api.Test;
import payment.CreditCardPaymentStrategy;
import payment.PayPalPaymentStrategy;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    Order normalOrder = Order.createNormalOrder(new CreditCardPaymentStrategy(), new PostDeliveryStrategy());
    Order quickOrder = Order.createQuickOrder(new PayPalPaymentStrategy(), new DHLDeliveryStrategy());

    @Test
    void getDescription() {
        assertEquals("This is normal order.", normalOrder.getDescription());
        assertEquals("This is quick order.", quickOrder.getDescription());
    }

    @Test
    void calculateTotalPrice() {
        assertEquals(0, normalOrder.calculateTotalPrice());
        quickOrder.addItem(new Flower(7, Color.BLACK, 4.1, FlowerType.ROSE));
        assertEquals(4.1, quickOrder.calculateTotalPrice());
    }
}