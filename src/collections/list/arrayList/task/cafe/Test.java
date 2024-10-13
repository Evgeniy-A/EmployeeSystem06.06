package collections.list.arrayList.task.cafe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Cafe cafe = new Cafe();

        Dish dish1 = new Dish("Пицца", 1, 450);
        Dish dish12 = new Dish("Пицца", 1, 450);
        Dish dish13 = new Dish("Пицца", 1, 450);
        Dish dish2 = new Dish("Суп", 1, 350);
        Dish dish3 = new Dish("Салат", 1, 250);
        Dish dish4 = new Dish("Напиток", 1, 200);

        Order order1 = new Order(dish1, dish2, dish3);
        Order order2 = new Order(dish12, dish4, dish3);
        Order order3 = new Order(dish2, dish3, dish4);
        Order order4 = new Order(dish13, dish3, dish4);

        cafe.addOrders(order1);
        cafe.addOrders(order2);
        cafe.addOrders(order3);
        cafe.addOrders(order4);

        //Найдите заказ с максимальной суммой (цена * количество)
        System.out.println(cafe.getOrderMaxPrice().getIdOrder());
        System.out.println(order1.getPrice());
        System.out.println(order2.getPrice());
        System.out.println(order3.getPrice());
        System.out.println(order4.getPrice());


        //Увеличьте количество порций для всех заказов
        //на определённое блюдо(имя блюда вводит пользователь)
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        //до
        if (order1.getDish(str) != null) {
            System.out.println(order1.getDish(str).getNumber());
        }
        cafe.addDishAllOrder(str);
        //после
        if (order1.getDish(str) != null) {
            System.out.println(order1.getDish(str).getNumber());
        }


        //Удалите заказы с общей стоимостью меньше
        //заданного порога (порог вводит пользователь)
        double min = sc.nextDouble();
        System.out.println(cafe.getList().size());
        cafe.lowPriceRemoveOrder(min);
        System.out.println(cafe.getList().size());


        //Найдите общую сумму всех заказов
        System.out.println(cafe.getPriceAllOrders());
    }
}