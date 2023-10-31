package lesson5.task4;


import java.util.ArrayList;
import java.util.List;

public class Table {

    private List<Philosopher> philosophers;

    public Table(int numPhilosophers) {
        philosophers = new ArrayList<>();
        Object[] forks = new Object[numPhilosophers];

        for (int i = 0; i < numPhilosophers; i++) {
            forks[i] = new Object();
        }

        for (int i = 0; i < numPhilosophers; i++) {
            philosophers.add(new Philosopher(forks[i]));
        }
    }

    public synchronized void start() {
        for (Philosopher philosopher: philosophers) {
            Runnable run = () -> {
                while (philosopher.getCount() > 0) {
                    int philosopherId = philosopher.getId();
                    philosopher.startEating();
                    philosopher.endEating();
                }
            };
            Thread thread = new Thread(run);
            thread.start();
        }
    }
}