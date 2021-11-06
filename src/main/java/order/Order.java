package order;

import delivery.Delivery;
import flower_units.Item;
import payment.Payment;

import java.util.ArrayList;
import java.util.List;

public abstract class Order {
    private final List<Item> itemList = new ArrayList<>();
    private Payment payment;
    private Delivery delivery;
    public final OrderNotifier orderNotifier = new OrderNotifier();

    protected Order(Payment payment, Delivery delivery){
        this.delivery = delivery;
        this.payment = payment;
    }

    public static QuickOrder createQuickOrder(Payment payment, Delivery delivery){
        return new QuickOrder(payment, delivery);
    }

    public static NormalOrder createNormalOrder(Payment payment, Delivery delivery){
        return new NormalOrder(payment, delivery);
    }

    public abstract String getDescription();

    public void setPaymentStrategy(Payment payment){
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery){
        this.delivery = delivery;
    }

    public double calculateTotalPrice(){
        double total_price = 0;
        for (Item item: this.itemList){
            total_price += item.price();
        }
        return total_price;
    }

    public void processOrder(){
        this.payment.pay(this.calculateTotalPrice());
        this.orderNotifier.notifyUsers("Order is paid.");
        this.delivery.deliver(this.itemList);
        this.orderNotifier.notifyUsers("Order is delivering.");
    }

    public void addItem(Item item){
        this.itemList.add(item);
    }

    public void removeItem(Item item){
        this.itemList.remove(item);
    }
}
