package decorators;

import flower_units.Flower;
import flower_units.Item;
import flower_units.enums.Color;
import flower_units.enums.FlowerType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaperDecoratorTest {

    Item flower = new Flower(4.0, Color.RED, 7.2, FlowerType.ROSE);
    @Test
    void price() {
        flower = new PaperDecorator(flower);
        assertEquals(20.2, flower.price());
    }

    @Test
    void getDescription() {
        flower = new PaperDecorator(flower);
        assertEquals("ROSE, decorated with paper", flower.getDescription());
    }
}