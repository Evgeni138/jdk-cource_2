package lection4.lesson4.task4;

import java.util.*;

public class NoteEmployee implements List<Emloyee> {

    private int initialCapacity = 5;
    private Emloyee[] emloyees;
    private int index = 0;

    public NoteEmployee() {
        this.emloyees = new Emloyee[this.initialCapacity];
    }



    public List<Emloyee> getEmployee(int workingYear) {
        List<Emloyee> searchedEmployees = new ArrayList<>();
        for (Emloyee employee : emloyees) {
            if (employee != null && workingYear == employee.getWorkingYears()) {
                searchedEmployees.add(employee);
            }
        }
        return searchedEmployees;
    }

    public Map<String, String> getPhone(String name) {
        Map<String, String> searchedPhone = new HashMap();
        for (Emloyee employee : emloyees) {
            if (employee != null && name == employee.getName()) {
                searchedPhone.put(employee.getName(), employee.getPhone());
            }
        }
        return searchedPhone;
    }

    public Emloyee getEmployeeById(int id) {
        for (Emloyee employee : emloyees) {
            if (employee != null && id == employee.getId()) {
                return employee;
            }
        }
        return null;
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
    public Iterator<Emloyee> iterator() {
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
    public boolean add(Emloyee emloyee) {
        emloyees[this.index++] = emloyee;
        return true;
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
    public boolean addAll(Collection<? extends Emloyee> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Emloyee> c) {
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

    @Override
    public Emloyee get(int index) {
        return null;
    }

    @Override
    public Emloyee set(int index, Emloyee element) {
        return null;
    }

    @Override
    public void add(int index, Emloyee element) {

    }

    @Override
    public Emloyee remove(int index) {
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
    public ListIterator<Emloyee> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Emloyee> listIterator(int index) {
        return null;
    }

    @Override
    public List<Emloyee> subList(int fromIndex, int toIndex) {
        return null;
    }
}
