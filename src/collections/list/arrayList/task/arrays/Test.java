package collections.list.arrayList.task.arrays;

public class Test {
    public static void main(String[] args) {
        MyArrayList<String> arr = new MyArrayList<>();

        arr.add("snt");
        System.out.println(arr.get(8));

        int[] arr1 = new int[]{1,2,3};
        int[] arr2 = new int[3];
        int[] arr3

        System.arraycopy(arr1, 0, arr2,0, arr1.length);


    }
    public static int[] copyArray(int[] arr1, int[] arr2){
        int[] array = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, array, 0, arr1.length);
        System.arraycopy(arr2, 0, array, arr1.length, arr2.length);
        return array;
    }


}
