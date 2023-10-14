package lection3.lesson3.task1;

import java.io.DataInput;
import java.io.InputStream;
import java.io.Serializable;

public class FirstClass <T extends Comparable, V extends DataInput, K extends Number> {
    T comparableItem;
    V dataItem;
    K numberItem;

    public FirstClass(T comparableItem, V dataItem, K numberItem) {
        this.comparableItem = comparableItem;
        this.dataItem = dataItem;
        this.numberItem = numberItem;
    }

    void getNamesClass() {
        System.out.println(comparableItem.getClass().getSimpleName());
        System.out.println(dataItem.getClass().getSimpleName());
        System.out.println(numberItem.getClass().getSimpleName());
    }
}
