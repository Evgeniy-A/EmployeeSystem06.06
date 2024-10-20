package collections.list.arrayList.task.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

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

    public void ensureCapacity() {
        if (elementData.length == size) {
            elementData = Arrays.copyOf(elementData, elementData.length * 2);
        }
    }

    public void ensureCapacity(int sizeCollection) {
        if (elementData.length < size + sizeCollection) {
            elementData = Arrays.copyOf(elementData, (size + sizeCollection) * 2);
        }
    }


    public void add(T element) {
        ensureCapacity();
        elementData[size++] = element;
    }

    public Object[] getElementData() {
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
        ensureCapacity();
        System.arraycopy(elementData,index, elementData,index + 1, size - index);
        elementData[index] = element;
    }

    public boolean addAll(Collection<? extends T> c){
        ensureCapacity(c.size());
        Object[] array = c.toArray();
        System.arraycopy(array, 0, elementData, size, c.size());
        size += c.size();
        return true;
    }






}