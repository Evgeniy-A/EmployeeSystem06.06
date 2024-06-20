package hometask.animal;

public class Tiger extends Animal {

    public Tiger() {
    }

    @Override
    public void makeSound() {
        System.out.println("Ррр...");
    }

    @Override
    public void sleep() {
        super.sleep();
    }
}
