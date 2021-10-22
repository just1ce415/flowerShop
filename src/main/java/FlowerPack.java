import enums.Color;
import enums.FlowerType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FlowerPack {
    private Flower containedFlower;
    private int quantity;

    public FlowerPack(Flower containedFlower, int quantity){
        this.containedFlower = containedFlower;
        this.quantity = quantity;
    }

    public double price(){
        return this.containedFlower.getPrice() * this.quantity;
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
