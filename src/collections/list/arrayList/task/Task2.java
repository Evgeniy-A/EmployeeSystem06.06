package collections.list.arrayList.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = 10;
        List<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            int randomNumb = random.nextInt(10) + 1;
            list.add(randomNumb);
        }
        System.out.println(list);
        System.out.println(list.get(4));
        list.set(6, list.get(6)*2);

        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }
}
