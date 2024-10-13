package collections.list.arrayList.task.cafe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cafe {

    private List<Order> list;

    public Cafe(Order... orders) {
        this.list = new ArrayList<Order>();
        for (Order o : orders) {
            this.list.add(o);
        }
    }

    public void addOrders(Order order) {
        list.add(order);
    }

    public List<Order> getList() {
        return list;
    }

    // Task1: находим заказ с максимальной ценой
    public Order getOrderMaxPrice() {
        double maxPrice = 0;
        int index = -1;

        for (int i = 0; i < list.size(); i++) {
            Order o = list.get(i);
            if (o.getPrice() > maxPrice) {
                maxPrice = o.getPrice();
                index = i;
            }
        }
        return list.get(index);
    }

    // Task2: Увеличьте количество порций для
    // всех заказов на определённое блюдо(имя блюда вводит пользователь)
    public void addDishAllOrder(String nameDish) {
        for (Order o : list) {
            Dish dish = o.getDish(nameDish);
            if (dish != null) {
                o.incrementDishNumber(dish);
            }
        }
    }

    // Task3 Удалите заказы с общей стоимостью меньше заданного порога
    public void lowPriceRemoveOrder(double price) {
        Iterator<Order> iterator = list.iterator();
        while (iterator.hasNext()) {
            Order o = iterator.next();
            if (o.getPrice() < price) {
                iterator.remove();
            }
        }
    }


    // Task4 Найдите общую сумму всех заказов
    public double getPriceAllOrders() {
        double allPrice = 0;
        for (Order o : list) {
            allPrice += o.getPrice();
        }
        return allPrice;
    }

}