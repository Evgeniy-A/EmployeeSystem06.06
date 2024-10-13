package collections.list.arrayList.task;

import java.util.ArrayList;
import java.util.List;

public class TestListCar {
    public static void main(String[] args) {
        List<Car> list = new ArrayList<>();
        Car car = new Car("bmw","1.6");
        list.add(car);
        list.remove(new Car("bmw","1.6"));
        System.out.println(list);

    }
}