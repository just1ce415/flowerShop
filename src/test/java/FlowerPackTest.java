import flower_units.enums.Color;
import flower_units.enums.FlowerType;
import flower_units.Flower;
import flower_units.FlowerPack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerPackTest {

    private final FlowerPack flowerPack = new FlowerPack(new Flower(5, Color.RED, 1.70, FlowerType.ROSE), 3);
    @Test
    void price() {
        assertEquals(5.1, flowerPack.price());
    }
}