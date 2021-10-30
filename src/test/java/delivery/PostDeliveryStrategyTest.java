package delivery;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PostDeliveryStrategyTest {

    Delivery delivery = new PostDeliveryStrategy();

    @Test
    void deliver() {
        assertEquals("Delivered by post", delivery.deliver(new ArrayList<>()));
    }
}