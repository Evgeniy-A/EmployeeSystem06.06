package collections.list.linkedlist;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Ex {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        List<Integer> list2 = new LinkedList<>();
        List<Integer> list3 = new LinkedList<>(List.of(1,2,3,4));
        List<Integer> list4 = new LinkedList<>(Arrays.asList(1,2,3,4));

        list2.add(2);


    }
}
