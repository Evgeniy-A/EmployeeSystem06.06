package clone.car;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException{
        Car car = new Car("Audi", new Car.Engine("hf"));
        Car car2 = new Car(car);

        car2.getEngine().setName("hbb");

        System.out.println(car.getEngine().getName());
    }
}