package lection4.task1;

public class Number implements Runnable{
    private static final int MAX_COUNT = 10;
    private static int currentNumber = 1;
    private final int num;
    private final Object monitor;

    public Number(int num, Object monitor) {
        this.num = num;
        this.monitor = monitor;
    }


    @Override
    public void run() {
        synchronized (monitor) {
            try {
                for (int i = 0; i < MAX_COUNT; i++) {
                    while (currentNumber != num) {
                        monitor.wait();
                    }
                    System.out.print(num + " ");
                    if (currentNumber == 3) {
                        currentNumber = 1;
                    } else {
                        currentNumber++;
                    }
                    monitor.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
