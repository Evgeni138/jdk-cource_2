package lesson5.task3;

import java.util.Random;

public class Runner {
    private static int count = 0;
    private int id;
    private boolean ready = false;
    private int distance = 0;
    {
        id = ++count;
    }
    Random rnd = new Random();

    public void setReady() {
        try {
            Thread.sleep(rnd.nextInt(1000));
            this.ready = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isReady() {
        return ready;
    }

    public int getDistance() {
        return distance;
    }

    public void run(int finish) {
        try {
            while (finish != distance) {
                Thread.sleep(rnd.nextInt(10));
                System.out.printf("I`m %d and I`m running! \n", id);
                distance++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
