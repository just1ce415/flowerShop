import flower_units.enums.Color;
import flower_units.enums.FlowerType;
import flower_units.Flower;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {

    private final Flower flower = new Flower(5, Color.RED, 1.70, FlowerType.ROSE);
    @org.junit.jupiter.api.Test
    void getColor() {
        assertEquals(Color.RED, flower.getColor());
    }

    @org.junit.jupiter.api.Test
    void getPrice() {
        assertEquals(1.70, flower.getPrice());
    }

    @org.junit.jupiter.api.Test
    void getFlowerType() {
        assertEquals(FlowerType.ROSE, flower.getFlowerType());
    }
}