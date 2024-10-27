package collections.list.arrayList.task.arrays;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        MyArrayList<String> arr = new MyArrayList<>();
        arr.add("a");
        arr.add("b");
        arr.add("c");
        arr.add("d");
        arr.add("e");
        arr.add("f");
        arr.add("g");
        System.out.println(arr);

        arr.set(2,"b");
        System.out.println(arr);

        System.out.println(arr.get(2));

        MyArrayList<Integer> arr2 = new MyArrayList<>();
        arr2.add(34558);

        MyArrayList<String> arr3 = new MyArrayList<>();
        arr3.add("h");
        arr3.add("i");
        arr3.add("j");
        arr3.add("k");
        arr3.add("l");
        arr3.add("m");
        arr3.add("n");
        arr3.add("o");

        //arr.addAll(2,arr2);
        System.out.println(arr.addAll(7, arr3));
        System.out.println(arr);

        System.out.println(arr.addAll(arr3));
        System.out.println(arr);

        //remove(index)
        arr.remove(0);
        System.out.println(arr);

        //remove(o)
        System.out.println(arr.remove("z"));
        System.out.println(arr.remove("b"));
        System.out.println(arr);

        //isEmpty()
        System.out.println(arr.isEmpty());

        //clear()
        arr.clear();
        System.out.println(arr);

        //contains(o)
        System.out.println(arr.addAll(arr3));
        System.out.println(arr.contains("j"));

        //indexOf()
        System.out.println(arr.indexOf("k"));

        arr.add("k");

        //lastIndexOf()
        System.out.println(arr.lastIndexOf("k"));

        //toArray()
        System.out.println(Arrays.toString(arr.toArray()));
        System.out.println(arr.toArray().getClass());

        //toArray(T[] a)
        String[] strArray = arr.toArray(new String[8]);
        System.out.println(Arrays.toString(strArray));

        String[] strArray2 = arr.toArray(new String[9]);
        System.out.println(Arrays.toString(strArray2));

        String[] strArray3 = arr.toArray(new String[10]);
        System.out.println(Arrays.toString(strArray3));


    }
}
