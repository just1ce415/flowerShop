import decorators.PaperDecorator;
import decorators.RibbonDecorator;
import delivery.DHLDeliveryStrategy;
import flower_units.FlowerBucket;
import flower_units.Item;
import flower_units.enums.Color;
import flower_units.enums.FlowerType;
import flower_units.Flower;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Item flower = new Flower(4.0, Color.RED, 7.2, FlowerType.ROSE);
        System.out.println(flower.getDescription());
        System.out.println(flower.price());
        flower = new RibbonDecorator(flower);
        System.out.println(flower.getDescription());
        flower = new PaperDecorator(flower);
        System.out.println(flower.getDescription());
        System.out.println(flower.price());
    }
}
