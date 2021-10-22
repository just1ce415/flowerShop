import enums.Color;
import enums.FlowerType;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Iterator;

@Getter
@Setter
public class FlowerFilterSpecification {

    double sepalLength = -1;
    double price = -1;
    FlowerType flowerType = null;
    Color color = null;

    boolean sepalLengthChanged = false;
    boolean priceChanged = false;
    boolean flowerTypeChanged = false;
    boolean colorChanged = false;

    public FlowerFilterSpecification(double sepalLength, double price, Color color, FlowerType flowerType){
        if (color != null){
            this.color = color;
        }
        if (flowerType != null){
            this.flowerType = flowerType;
        }
        if (sepalLength != -1){
            this.sepalLength = sepalLength;
        }
        if (price != -1){
            this.price = price;
        }
    }

    private void resetAttrs(){
        if (this.sepalLengthChanged){
            this.setSepalLength(-1);
        }
        if (this.priceChanged){
            this.setPrice(-1);
        }
        if (this.colorChanged){
            this.setColor(null);
        }
        if (this.flowerTypeChanged){
            this.setFlowerType(null);
        }
        this.colorChanged = false;
        this.flowerTypeChanged = false;
        this.priceChanged = false;
        this.sepalLengthChanged = false;
    }

    public ArrayList<FlowerPack> filter(Store store){
        return applyFilter(store);
    }

    protected ArrayList<FlowerPack> applyFilter(Store store){
        ArrayList<FlowerPack> fittedPacks = new ArrayList<>();
        Iterator<FlowerBucket> bucketIterator = store.getBucketIterator();
        while(bucketIterator.hasNext()){
            Iterator<FlowerPack> packIterator = bucketIterator.next().getPackIterator();
            while(packIterator.hasNext()){
                FlowerPack flowerPack = packIterator.next();
                if (this.getSepalLength() == 0.0){
                    this.setSepalLength(flowerPack.getFlowerSepalLength());
                    this.setSepalLengthChanged(true);
                }
                if (this.getPrice() == 0.0){
                    this.setPrice(flowerPack.price());
                    this.setPriceChanged(true);
                }
                if (this.getColor() == null){
                    this.setColor(flowerPack.getFlowerColor());
                    this.setColorChanged(true);
                }
                if (this.getFlowerType() == null){
                    this.setFlowerType(flowerPack.getFlowerType());
                    this.setFlowerTypeChanged(true);
                }

                if (this.getSepalLength() == flowerPack.getFlowerSepalLength() && this.getPrice() >= flowerPack.price() && this.getColor().equals(flowerPack.getFlowerColor()) && this.getFlowerType().equals(flowerPack.getFlowerType())){
                    fittedPacks.add(flowerPack);
                }
                this.resetAttrs();
            }
        }
        return fittedPacks;
    }
}
