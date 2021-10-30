import flower_units.Store;
import flower_units.enums.Color;
import flower_units.enums.FlowerType;
import flower_units.Flower;
import flower_units.FlowerBucket;
import flower_units.FlowerPack;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    FlowerPack flowerPack1 = new FlowerPack(new Flower(7, Color.BLACK, 2.1, FlowerType.ROSE), 3);
    FlowerPack flowerPack2 = new FlowerPack(new Flower(8, Color.RED, 1.4, FlowerType.TULIP), 5);
    FlowerPack flowerPack3 = new FlowerPack(new Flower(7, Color.MAGENTA, 4.3, FlowerType.CHAMOMILE), 1);
    FlowerPack flowerPack4 = new FlowerPack(new Flower(5, Color.RED, 1.8, FlowerType.CACTUS), 10);
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
        ArrayList<FlowerPack> flowerPacks1 = store.find(7, 10, null, null);
        ArrayList<FlowerPack> flowerPacks2 = store.find(-1, -1, Color.RED, FlowerType.CACTUS);
        assertEquals(7, flowerPacks1.get(0).getFlowerSepalLength());
        assertTrue(10 > flowerPacks1.get(1).price());
        assertEquals(FlowerType.CACTUS, flowerPacks2.get(0).getFlowerType());
    }
}