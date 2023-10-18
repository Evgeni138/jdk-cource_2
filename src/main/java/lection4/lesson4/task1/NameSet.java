package lection4.lesson4.task1;

import java.util.*;

public class NameSet implements Set {

    public Set<String> names;

    public NameSet(List<Name> names) {
        List<String> listNames = new ArrayList<>();
        for (Name name : names) {
            listNames.add(name.getName());
        }
        this.names = new HashSet<String>(listNames) {
        };
    }

    public String reversName(String name) {
        if (name.length() <= 1) return name;
            else {
                 return reversName(name.substring(1)) + name.charAt(0);
        }
    }

    public String reversBiggestItem() {
        String biggestName= "";
        for (String name: this.names) {
            if (name.length() > biggestName.length()) biggestName = name;
        }
        String result = reversName(biggestName);
        return result;
    }

    public void withoutA() {
        List<String> result = new ArrayList<>();
        for (String name: names) {
            if (!name.toLowerCase().contains("a")) result.add(name);
        }
        System.out.println(result);
    }

    @Override
    public String toString() {
        String result = "";
        for (String name : names) {
            result += String.format("%s ,", name);
        }
        return result;
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
    public void clear() {

    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
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
