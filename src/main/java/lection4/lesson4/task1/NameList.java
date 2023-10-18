package lection4.lesson4.task1;

import java.util.*;

public class NameList implements List {

    public List<Name> names;

    public NameList(List<Name> names) {
        this.names = names;
    }

    public NameList sortABC() {
        List<Name> sortedNames = new ArrayList<>(this.names);

        sortedNames.sort(new Comparator<Name>() {
            @Override
            public int compare(Name o1, Name o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });
        System.out.println();
        return new NameList(sortedNames);
    }

    public NameList sortSize() {
        List<Name> sortedList = new ArrayList<>(this.names);
        sortedList.sort(new Comparator<Name>() {
            @Override
            public int compare(Name o1, Name o2) {
                if (o1.getName().length() > o2.getName().length()) return 1;
                    else if (o1.getName().length() < o2.getName().length()) return -1;
                    else return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });
        return new NameList(sortedList);
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
