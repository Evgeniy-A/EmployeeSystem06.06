package clothes;

public class Tie extends Clothes implements MensClothing{
    public Tie(ClothesSize size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void toDressMan(String color) {

    }
}
