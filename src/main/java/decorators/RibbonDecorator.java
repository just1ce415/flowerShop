package decorators;

import flower_units.Item;

public class RibbonDecorator extends Decorator{
    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public double price() {
        return super.price() + 40;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", decorated with ribbon";
    }
}
