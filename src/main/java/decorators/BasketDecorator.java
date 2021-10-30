package decorators;

import flower_units.Item;

public class BasketDecorator extends Decorator{
    public BasketDecorator(Item item) {
        super(item);
    }

    @Override
    public double price() {
        return super.price() + 4;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", decorated with basket";
    }
}
