package lection4;

import java.util.ArrayList;
import java.util.List;

public class CME {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
        Runnable r1 = () -> {
            for (int i = 0; i < 10000; i++) {
                synchronized (list) {
                    list.add(i);
                }
            }
        };
        Runnable r2 = () -> {
            synchronized (list) {
                for (Integer item : list) {
                    System.out.print(item + " ");
                }
            }
        };

        new Thread(r1).start();
        new Thread(r2).start();

    }
}
