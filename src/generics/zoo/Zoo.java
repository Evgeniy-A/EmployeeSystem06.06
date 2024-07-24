package generics.zoo;

public class Zoo<T extends Animal> {
    T [] zoo;

    public Zoo(T[] zoo) {
        this.zoo = zoo;
    }
}
