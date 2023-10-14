package lection3.lesson3.task4;

import java.util.Iterator;

public class Club <T extends Person> implements Iterable<T>{
    private T[] community;

    public Club(T[] community) {
        this.community = community;
    }

    public void restForAll() {
        for (T t: community) {
            t.haveRest();
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new ParamIterator<T>();
    }

    public class ParamIterator<T extends Person> implements Iterator<T> {

        private int index = 0;


        @Override
        public boolean hasNext() {
            return index < community.length;
        }

        @Override
        public T next() {
            return (T)community[index++];
        }
    }
}