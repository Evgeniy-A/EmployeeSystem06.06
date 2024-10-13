package collections.list.arrayList.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = 20;
        List<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            int randomNumb = random.nextInt(20) + 1;
            list.add(randomNumb);
        }
        System.out.println(list);

        for (int i = list.size() - 1 ; i >= 0; i--) {

            if(list.get(i) % 2 == 0){
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}