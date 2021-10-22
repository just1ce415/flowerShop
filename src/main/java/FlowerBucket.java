import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FlowerBucket {
    private List<FlowerPack> flowerBucket = new ArrayList<>();

    public double price(){
        double total_price = 0;
        for (FlowerPack flowerPack : this.flowerBucket) {
            total_price += flowerPack.price();
        }
        return  total_price;
    }

    public void addFlowerPack(FlowerPack flowerPack){
        this.flowerBucket.add(flowerPack);
    }

    public Iterator<FlowerPack> getPackIterator(){
        return this.flowerBucket.iterator();
    }
}
