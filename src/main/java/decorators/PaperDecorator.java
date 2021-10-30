package decorators;

import flower_units.Item;

public class PaperDecorator extends Decorator{
    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public double price() {
        return super.price() + 13;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", decorated with paper";
    }
}
