package kata.all;


import java.util.Arrays;

import static kata.all.Task1.*;


public class Test1 {
    public static void main(String[] args) {
        int[] numbers = {5, 6, 7};
        int[] numbers1 = {1, 2, 3, 4};

        System.out.println(Arrays.toString(inverseArray(numbers)));
        System.out.println(Arrays.toString(mergeAndSort(numbers, numbers1)));

        printArray(numbers1);

        System.out.println(Arrays.toString(getArrayMiddle(numbers)));
 String name = "Женя";
        System.out.println(name);
    }
}
