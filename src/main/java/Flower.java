import enums.Color;
import enums.FlowerType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Flower {
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
}
