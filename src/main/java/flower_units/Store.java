package flower_units;

import flower_units.enums.Color;
import flower_units.enums.FlowerType;
import flower_units.FlowerBucket;
import flower_units.FlowerPack;

import java.util.ArrayList;
import java.util.Iterator;

public class Store {
    private final ArrayList<FlowerBucket> flowerBuckets = new ArrayList<>();

    public void addFlowerBucket(FlowerBucket flowerBucket){
        this.flowerBuckets.add(flowerBucket);
    }

    public FlowerBucket popFlowerBucket(){
        return this.flowerBuckets.remove(0);
    }

    public Iterator<FlowerBucket> getBucketIterator(){
        return this.flowerBuckets.iterator();
    }

    public ArrayList<FlowerPack> find(double sepalLength, double price, Color color, FlowerType flowerType){
        FlowerFilterSpecification flowerFilterSpecification = new FlowerFilterSpecification(sepalLength, price, color, flowerType);
        return flowerFilterSpecification.filter(this);
    }
}
