package collections.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List <Integer> list = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) % 2 == 0){
                list.remove(i);
            }
        }

        System.out.println(list);
    }
}