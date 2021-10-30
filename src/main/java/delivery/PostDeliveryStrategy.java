package delivery;

import flower_units.Item;

import java.util.List;

public class PostDeliveryStrategy implements Delivery {
    @Override
    public String deliver(List<Item> items) {
        return ("Delivered by post");
    }
}
