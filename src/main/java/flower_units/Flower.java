package flower_units;

import flower_units.enums.Color;
import flower_units.enums.FlowerType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Flower extends Item {
    private double sepalLength;
    private Color color;
    private double price;
    private FlowerType flowerType;

    public Flower(double sepalLength, Color color, double price, FlowerType flowerType){
        this.sepalLength = sepalLength;
        this.color = color;
        this.price = price;
        this.flowerType = flowerType;
    }

    @Override
    public double price(){
        return this.getPrice();
    }

    @Override
    public String getDescription() {
        return flowerType.toString();
    }

}
