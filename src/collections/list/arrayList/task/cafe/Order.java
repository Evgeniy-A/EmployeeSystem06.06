package collections.list.arrayList.task.cafe;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Dish> dishes;
    private double price;

    private int idOrder;
    private static int idCount = 0;

    public Order() {
        idOrder = idCount++;
    }

    public Order(Dish... dishes) {
        this.dishes = new ArrayList<Dish>();
        for (Dish d : dishes) {
            this.dishes.add(d);
            price += d.getPrice();
        }
        idOrder = idCount++;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public double getPrice() {
        return price;
    }

    // добавление блюда в заказ
    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    // поиск блюда по названию
    public Dish getDish(String nameDish) {
        for (Dish d : dishes) {
            if (d.getName().equalsIgnoreCase(nameDish)) {
                return d;
            }
        }
        return null;
    }

    // изменение порции блюда в заказе.
    public void incrementDishNumber(Dish dish) {
        dish.setNumber(dish.getNumber() + 1);
    }

}