import enums.Color;
import enums.FlowerType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerBucketTest {

    private final FlowerPack flowerPack = new FlowerPack(new Flower(5, Color.RED, 1.70, FlowerType.ROSE), 3);
    private final FlowerBucket flowerBucket = new FlowerBucket();
    @Test
    void price() {
        flowerBucket.addFlowerPack(flowerPack);
        flowerBucket.addFlowerPack(flowerPack);
        assertEquals(10.2, flowerBucket.price());
    }
}