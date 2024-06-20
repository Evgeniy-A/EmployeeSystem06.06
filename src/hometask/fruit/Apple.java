package hometask.fruit;

public class Apple extends Fruit {

    private static int PRICE = 100;
    private static int WEIGHT = 50;


    public Apple(int weightInKg) {
        super(weightInKg, PRICE);
    }

    public Apple() {
        super(WEIGHT, PRICE);
    }

    @Override
    public String getPlace() {
        return "Made in Armenia";
    }

    public static int getPRICE() {
        return PRICE;
    }

    public static void setPRICE(int PRICE) {
        Apple.PRICE = PRICE;
    }
}
