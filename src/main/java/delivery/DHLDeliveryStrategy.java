package delivery;

import flower_units.Item;

import java.util.List;

public class DHLDeliveryStrategy implements Delivery {
    @Override
    public String deliver(List<Item> item) {
        return ("Delivered by DHL");
    }
}
