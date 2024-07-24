package clothes;

public abstract class Clothes {
     private ClothesSize clothingSize;
     private int cost;
    private String color;

    public Clothes( ClothesSize size, int cost, String color) {
        this.clothingSize = size;
        this.cost = cost;
        this.color = color;
    }

    public Clothes() {
    }

    public ClothesSize getClothingSize() {
        return clothingSize;
    }

    public int getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }

}
