package hometask.frut.person.frut;

public abstract  class Fruit {
    private int weightInKg;
    private int pricePerKg;

    public Fruit(int weightInKg, int pricePerKg) {
        this.weightInKg = weightInKg;
        this.pricePerKg = pricePerKg;
    }

    public int getCost(){
        return weightInKg * pricePerKg;
    }

    public abstract String getPlace();

}
