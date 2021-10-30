package flower_units;

import flower_units.enums.Color;
import flower_units.enums.FlowerType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FlowerPack extends Item{
    private Flower containedFlower;
    private int quantity;

    public FlowerPack(Flower containedFlower, int quantity){
        this.containedFlower = containedFlower;
        this.quantity = quantity;
    }

    @Override
    public double price(){
        return this.containedFlower.getPrice() * this.quantity;
    }

    @Override
    public String getDescription() {
        return "A pack of " + this.getFlowerType().toString();
    }

    public double getFlowerSepalLength(){
        return this.containedFlower.getSepalLength();
    }

    public FlowerType getFlowerType(){
        return this.containedFlower.getFlowerType();
    }

    public Color getFlowerColor(){
        return this.containedFlower.getColor();
    }
}
