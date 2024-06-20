package hometask.fruit;

public class Pear extends Fruit{

    private static int PRICE = 200;
    private static int WEIGHT = 10;

    public Pear(int weightInKg) { super(weightInKg, PRICE);}

    public Pear() {
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
        Pear.PRICE = PRICE;
    }
}

