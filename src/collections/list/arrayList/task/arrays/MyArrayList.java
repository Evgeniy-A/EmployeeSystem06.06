package collections.list.arrayList.task.arrays;

import java.util.Arrays;
import java.util.Objects;

public class MyArrayList<T> {

    private Object[] elementData;

    private int size = 0;

    private static final int DEFAULT_CAPACITY = 10;

    public MyArrayList(int initialCapacity) {
        this.elementData = new Object[initialCapacity];
    }

      public MyArrayList() {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }

    public int getSize() {
        return size;
    }

    //
//  //  public void ensureCapacity() {
//   //     if (elementData.length == size) {
//    //        elementData = Arrays.copyOf(elementData, elementData.length * 2);
//   //     }
//    //}
    private void ensureCapacity(int minCapacity) {
        if (minCapacity > elementData.length) {
            int newCapacity = elementData.length * 2;
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            elementData = Arrays.copyOf(elementData, newCapacity);
        }
    }

//    public void ensureCapacity(int sizeCollection) {
//        if (elementData.length < size + sizeCollection) {
//            elementData = Arrays.copyOf(elementData, (size + sizeCollection) * 2);
//        }
//    }


    public void add(T element) {
        ensureCapacity(size + 1);
        elementData[size++] = element;
    }

    private Object[] getElementData() {
        return elementData;
    }

    public void set(int index, T element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(
                    String.format("индекс %d выходит за пределы массива длинной %d", index, size));
        }
        elementData[index] = element;

    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(
                    String.format("индекс %d выходит за пределы массива длинной %d", index, size));
        }
        return (T) elementData[index];
    }

    public void add(int index, T element){
        ensureCapacity(size + 1);
        System.arraycopy(elementData,index, elementData,index + 1, size - index);
        elementData[index] = element;
    }

    public boolean addAll(MyArrayList<String> c){
        int cSize = c.getSize();
        ensureCapacity(size + cSize);
        Object[] array = c.toArray();
        System.arraycopy(array, 0, elementData, size, cSize);
        size += cSize;
        return cSize != 0;
    }

    public boolean addAll(int index, MyArrayList<String> c) {
        if (index > size || index < 0){
            throw new IndexOutOfBoundsException("Индекс выходит за пределы коллекции");
        }
        int cSize = c.size;
        ensureCapacity(size + cSize);
        Object[] array = c.toArray();
        System.arraycopy(elementData, index, elementData, index + cSize, size - index);
        System.arraycopy(array, 0, elementData, index, cSize);
        size += cSize;
        return cSize != 0;
    }

    // 24.09.2024

    public T remove(int index){
        if (index >= size || index < 0){
            throw new IndexOutOfBoundsException("Индекс выходит за пределы коллекции");
        }
        @SuppressWarnings("unchecked")
        T object = (T) elementData[index];
        int nextIndex = index + 1;
        int lastIndex = size - 1;
        System.arraycopy(elementData, nextIndex, elementData, index,size - nextIndex);
        elementData[lastIndex] = null;
        size--;
        return object;
    }

    public boolean remove(Object o) {
        for (int i = 0; i < size; i++) {
            if (elementData[i].equals(o)){
                remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty(){
        return (size == 0);
    }

    public void clear() {
        this.elementData = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public boolean contains(Object o) {
        return indexOf(o) > -1;
    }

    public int indexOf(Object o){
        for(int i = 0; i < size; i++){
            if (elementData[i].equals(o)){
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object o){
        for(int i = size -1; i > -1; i--){
            if (elementData[i].equals(o)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyArrayList<?> that = (MyArrayList<?>) o;
        return size == that.size && Arrays.equals(elementData, that.elementData);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size);
        result = 31 * result + Arrays.hashCode(elementData);
        return result;
    }

    public Object[] toArray(){
        return Arrays.copyOf(elementData, size);
    }

    @SuppressWarnings("unchecked")
    public<T> T[]  toArray(T[] a){
        if(a.length < size){
            return (T []) Arrays.copyOf(elementData, size, a.getClass());
        }
        System.arraycopy(elementData, 0, a, 0, size);
        if(a.length > size) {
            a[size] = null;
        }
        return a;
    }

    @Override
    public String toString() {
        return Arrays.toString(elementData);
    }
}