package lection3.lesson3.task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ParamCollection<Double> paramCollection = new ParamCollection<>(new Double[10]);
        paramCollection.add(1.0);
        paramCollection.add(2.0);
        paramCollection.add(3.0);
        paramCollection.add(1.0);
        paramCollection.add(2.0);
        paramCollection.add(3.0);
        paramCollection.add(1.0);
        paramCollection.add(2.0);
        paramCollection.add(3.0);
        paramCollection.delete(1);
        for (Double aDouble : paramCollection) {
            System.out.println(aDouble);
        }
        System.out.println(paramCollection);
    }
}
