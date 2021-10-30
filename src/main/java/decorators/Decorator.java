package decorators;

import flower_units.Item;

public abstract class Decorator extends Item {
    private final Item item;
    public Decorator(Item item){
        this.item = item;
    }

    @Override
    public double price() {
        return item.price();
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }
}
