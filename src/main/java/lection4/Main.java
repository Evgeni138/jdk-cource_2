package lection4;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Collection<Integer> collection = List.of(1, 2, 3, 4, 5);

        // Iterator
        Iterator<Integer> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // for each
        for (Integer value: collection) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Stream api
        collection.stream()
                .forEach(value -> System.out.print(value + " "));
        System.out.println();

        collection.stream().forEach(System.out::println);

        // Map

        Map<String, Integer> map = Map.of("Hello", 1, "World", 2);
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();
        for (String s : map.keySet()) {
            System.out.println(s + ": " + map.get(s));
        }
        System.out.println();
        // Stream
        map.forEach((k, v) -> System.out.println(k + ": " + v));
        System.out.println(map.containsValue(2));
    }
}
