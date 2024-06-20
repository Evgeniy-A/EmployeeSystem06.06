package hometask.animal;

public class Cow extends Animal{

    public Cow() {
    }

    @Override
    public void makeSound() {
        System.out.println("Му...");
    }

    @Override
    public void sleep() {
        super.sleep();
    }
}
