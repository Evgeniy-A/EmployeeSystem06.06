package collections.list.arrayList.task.home_task;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HomeTask {
    public static void main(String[] args) {

        //Задача 1: Использование subList() для работы с частью списка

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 21; i++) {
            list.add(i);
        }

        List<Integer> list2 = list.subList(5,15);
        for (int i = 0; i < list2.size(); i++) {
            list2.set(i, list2.get(i) + 5);
        }
        System.out.println(list);
        System.out.println(list2);

        //Задача 2: Работа с Arrays.asList()

        String[] arr = new String[7];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Заполните дни недели");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextLine();
        }
        List<String> list3 = Arrays.asList(arr);
        list3.set(0, "вторник");

        System.out.println(list3);

        //Задача 3: Проверка подсписка с containsAll()

        List<String> mainList  = new ArrayList<>();
        List<String> checkList = new ArrayList<>();

        mainList.add("Java");
        mainList.add("Python");
        mainList.add("C++");
        mainList.add("JavaScript");

        checkList.add("Java");
        checkList.add("Python");

        System.out.println(mainList.containsAll(checkList));

        //Задача 4: Использование retainAll() для нахождения общих элементов

        List<Integer> list4 = new ArrayList<>();
        List<Integer> list5 = new ArrayList<>();

        list4.add(1);
        list4.add(2);
        list4.add(3);
        list4.add(4);
        list4.add(5);
        list4.add(6);

        list5.add(4);
        list5.add(5);
        list5.add(6);
        list5.add(7);
        list5.add(8);

        list4.retainAll(list5);
        System.out.println(list4);
        
        //Работа с List.toArray()

        List<String> list6 = new ArrayList<>();
        list6.add("apple");
        list6.add("banana");
        list6.add("orange");

        String[] arrList = list6.toArray(new String[0]);
        System.out.println(Arrays.toString(arrList));

        //Копирование списка с List.copyOf()

        List<String> list7 = new ArrayList<>();
        list7.add("cat");
        list7.add("dog");
        list7.add("mouse");

        List<String> list8 = List.copyOf(list7);
        //list8.add("beard");
        System.out.println(list8);

        //Создание неизменяемого списка с List.of()
        List<String> list9 = List.of("dog","cat","beard");
        //list9.add("mouse");
    }
}