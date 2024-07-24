package generics.task4;

import java.util.List;

public class Test {
    public static <T> void printList(List<T> list){
        for (T element: list){
            System.out.println(element);
        }
    }
}
