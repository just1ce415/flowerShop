package flower_units;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FlowerBucket extends Item {
    private final List<FlowerPack> flowerBucket = new ArrayList<>();

    @Override
    public double price(){
        double total_price = 0;
        for (FlowerPack flowerPack : this.flowerBucket) {
            total_price += flowerPack.price();
        }
        return  total_price;
    }

    @Override
    public String getDescription() {
        return "A bucket of flower packs";
    }

    public void addFlowerPack(FlowerPack flowerPack){
        this.flowerBucket.add(flowerPack);
    }

    public Iterator<FlowerPack> getPackIterator(){
        return this.flowerBucket.iterator();
    }

    // No searchFlower() method here because it violates single-responsibility principle.
    // To search flowers use FlowerFilterSpecification
}
