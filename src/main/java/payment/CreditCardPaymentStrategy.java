package payment;

public class CreditCardPaymentStrategy implements Payment {
    @Override
    public String pay(double price) {
        return "Paid with credit card";
    }
}
