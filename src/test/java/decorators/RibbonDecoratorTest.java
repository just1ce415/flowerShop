package decorators;

import flower_units.Flower;
import flower_units.FlowerPack;
import flower_units.Item;
import flower_units.enums.Color;
import flower_units.enums.FlowerType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RibbonDecoratorTest {

    Item flowerPack = new FlowerPack(new Flower(5.1, Color.BLACK, 5.6, FlowerType.ROMASHKA), 3);
    @Test
    void getDescription() {
        flowerPack = new RibbonDecorator(flowerPack);
        assertEquals("A pack of ROMASHKA, decorated with ribbon", flowerPack.getDescription());
    }
}