package collections.list.arrayList.task;

import java.util.Objects;

public class Car {
    private String model;
    private String engine;

    public Car(String model, String engine) {
        this.model = model;
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model) && Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, engine);
    }
}
