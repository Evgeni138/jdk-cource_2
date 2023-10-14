package lection3.lesson3.task2;

import java.util.Arrays;
import java.util.Iterator;

public class ParamCollection<T> implements Iterable<T>{
    private T[] array;
    private int index = 0;
    private int size;

    public ParamCollection(T[] array) {
        this.array = array;
        this.size = array.length;
    }

    public void add(T item) {
        if (index < size) {
            array[index] = item;
            index++;
        } else throw new RuntimeException("Array is full!");
    }

    public void delete(int index) {
        array[index] = null;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    public int getSize() {
        return size;
    }

    public T getByIndex(int index) {
        return array[index];
    }

    @Override
    public Iterator iterator() {
        return new ParamIterator<>(this);
    }
}
