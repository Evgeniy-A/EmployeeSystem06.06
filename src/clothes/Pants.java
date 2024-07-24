package clothes;

public class Pants extends Clothes implements WomensClothings, MensClothing {
    public Pants(ClothesSize size, int cost, String color) {
        super(size, cost, color);
    }

    public Pants(){};

    @Override
    public void toDressMan(String color) {

    }

    @Override
    public void toDressWomen(String color) {

    }
}
