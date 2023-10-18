package lection4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;

// Integer, Integer
public class HMap {
    private int capacity;

    private ArrayList<LinkedList<Integer>> map;

    public HMap(ArrayList<LinkedList<Integer>> map) {
        capacity = 100;
        this.map = map;
        for (int i = 0; i < capacity; i++) {
            map.add(new LinkedList<>());
        }
    }

    public void put(Integer key, Integer value) {
        int code = key.hashCode() % capacity;
        LinkedList<Integer> list = map.get(code);
        if (!list.contains(value)) {
            list.add(value);
        }
    }


}
