package lesson5.task4;

public class Philosopher implements Runnable {
    private static int counter = 0;
    private int id;
    private boolean flagEating;
    private boolean flagThinking;
    private int count = 3;
    private int num = 0;
    private Object fork;

    private int currentPhilosopher;

    {
        id = ++counter;
    }
    public Philosopher(Object fork) {
        this.fork = fork;
        flagEating = false;
        flagThinking = true;
    }

    public synchronized void startEating() {
        try {
            synchronized (fork) {
                while (!flagEating && count > 0) {
                    System.out.printf("Philosopher %d is eating. time № %d\n", id, ++num);
                    flagEating = true;
                    flagThinking = false;
                    Thread.sleep(500);
                    count--;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void endEating() {
        synchronized (fork) {
            flagEating = false;
            flagThinking = true;
        }
    }

    public int getCount() {
        return count;
    }

    public int getId() {
        return id;
    }

    @Override
    public void run() {
        while (getCount() > 0) {
            startEating();
            endEating();
        }
    }
}