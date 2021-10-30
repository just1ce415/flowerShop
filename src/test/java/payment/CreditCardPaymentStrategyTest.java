package payment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardPaymentStrategyTest {

    Payment payment = new CreditCardPaymentStrategy();

    @Test
    void pay() {
        assertEquals("Paid with credit card", payment.pay(100000));
    }
}