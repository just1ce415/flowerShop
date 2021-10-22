import enums.Color;
import enums.FlowerType;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    FlowerPack flowerPack1 = new FlowerPack(new Flower(7, Color.BLACK, 2.1, FlowerType.ROSE), 3);
    FlowerPack flowerPack2 = new FlowerPack(new Flower(8, Color.RED, 1.4, FlowerType.TULIP), 5);
    FlowerPack flowerPack3 = new FlowerPack(new Flower(7, Color.MAGENTA, 4.3, FlowerType.CHAMOMILE), 1);
    FlowerPack flowerPack4 = new FlowerPack(new Flower(5, Color.RED, 1.8, FlowerType.ROSE), 10);
    FlowerBucket flowerBucket1 = new FlowerBucket();
    FlowerBucket flowerBucket2 = new FlowerBucket();
    Store store = new Store();
    @Test
    void find() {
        flowerBucket1.addFlowerPack(flowerPack1);
        flowerBucket1.addFlowerPack(flowerPack2);
        flowerBucket2.addFlowerPack(flowerPack3);
        flowerBucket2.addFlowerPack(flowerPack4);
        store.addFlowerBucket(flowerBucket1);
        store.addFlowerBucket(flowerBucket2);
        ArrayList<FlowerPack> flowerPacks = store.find(7, 10, null, null);
        assertEquals(7, flowerPacks.get(0).getFlowerSepalLength());
        assertTrue(10 > flowerPacks.get(1).price());
    }
}