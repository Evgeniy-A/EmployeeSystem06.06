package clothes;

public class Skirt extends Clothes implements WomensClothings{
    public Skirt(ClothesSize size, int cost, String color) {
        super(size, cost, color);
    }

    public Skirt(){};

    @Override
    public void toDressWomen(String color) {

    }
}
