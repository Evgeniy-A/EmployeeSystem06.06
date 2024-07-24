package clothes;

import java.sql.SQLOutput;

public class TeeShirt extends Clothes implements MensClothing, WomensClothings{
    public TeeShirt(ClothesSize clothingSize, int cost, String color) {
        super(clothingSize, cost, color);
    }

    public TeeShirt() {};

    @Override
    public void toDressWomen(String color) {
        System.out.printf("Женщина одела футболку %s цвета", color);
    }
    @Override
    public void toDressMan(String color) {
        System.out.printf("Мужчина одел футболку %s цвета", color);
    }
}

