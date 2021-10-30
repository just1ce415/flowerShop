package order;

import delivery.Delivery;
import flower_units.Item;
import payment.Payment;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<Item> itemList = new ArrayList<>();
    private Payment payment;
    private Delivery delivery;

    public Order(Payment payment, Delivery delivery){
        this.delivery = delivery;
        this.payment = payment;
    }

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public int calculateTotalPrice(){
        int total_price = 0;
        for (Item item: this.itemList){
            total_price += item.price();
        }
        return total_price;
    }

    public void processOrder(){
        this.payment.pay(this.calculateTotalPrice());
        this.delivery.deliver(this.itemList);
    }

    public void addItem(Item item){
        this.itemList.add(item);
    }

    public void removeItem(Item item){
        this.itemList.remove(item);
    }
}
