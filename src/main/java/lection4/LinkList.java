package lection4;

import java.util.Collection;
import java.util.Iterator;

public class LinkList implements Collection<Integer> {
    private LinkNode head, tail;
    private int size = 0;


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == tail && head == null;
    }

    @Override
    public boolean contains(Object o) {
        //
        return false;
    }

    @Override
    public Iterator<Integer> iterator() {
        //
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Integer value) {
        if (head == null) {
            head = new LinkNode(value, null, null);
            tail = head;
        } else {
            LinkNode current = new LinkNode(value, head, null);
            LinkNode prev = tail;
            tail.setNext(current);
            tail = current;
            tail.setPrevious(prev);
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
