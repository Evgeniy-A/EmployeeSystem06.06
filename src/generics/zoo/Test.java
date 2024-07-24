package generics.zoo;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();

        Zoo<Animal> zoo = new Zoo<>(new Animal[]{cat});
    }
}
