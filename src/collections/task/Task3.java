package collections.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {

    public static List<Integer>  newArrayList(List<Integer> list){
        for (int i = list.size() - 1; i >= 0; i--) {
            if(list.get(i) < 0) {
                list.remove(i);
            }
        }
        for (int i = 0; i < list.size(); i += 2) {
            list.set(i, list.get(i) * 2);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(10);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.println(newArrayList(list));
    }
}
