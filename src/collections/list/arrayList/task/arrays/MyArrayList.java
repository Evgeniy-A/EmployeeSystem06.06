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
        ensureCapacity(size + 1);
        System.arraycopy(elementData,index, elementData,index + 1, size - index);
        elementData[index] = element;
    }

    public boolean addAll(Collection<? extends T> c){
        int cSize = c.size();
        ensureCapacity(size + cSize);
        Object[] array = c.toArray();
        System.arraycopy(array, 0, elementData, size, cSize);
        size += cSize;
        return cSize != 0;
    }

    public boolean addAll(int index, Collection<? extends T> c) {
        if (index > size || index < 0){
            throw new IndexOutOfBoundsException("Индекс выходит за пределы коллекции");
        }
        int cSize = c.size();
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
        boolean isremove = false;
        if (o == null){
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (elementData[i].equals(o)){
                remove(i);
                isremove = true;
                break;
            }
        }
        return isremove;
    }

    public boolean isEmpty(){
        return (size == 0);
    }

    public void clear() {
        if (isEmpty()){
            throw new UnsupportedOperationException ("Коллекция пуста");
        }
        for (int i = 0; i < size; i++) {
            elementData[i] = null;
        }
    }

    public boolean contains(Object o) {
        boolean isContains = false;
        for (Object e : elementData) {
            if(e.equals(o)){
                isContains = true;
            }
        }
        return isContains;
    }
}