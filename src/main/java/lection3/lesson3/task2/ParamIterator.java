package lection3.lesson3.task2;

import java.util.Iterator;

public class ParamIterator<T> implements Iterator<T> {

    ParamCollection<T> collection;

    private int index = 0;

    public ParamIterator(ParamCollection<T> collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        return (index < collection.getSize());
    }

    @Override
    public T next() {
        return collection.getByIndex(index++);
    }
}
