package lesson5.task1;

public class ObjectA {
    private int value = 10;

    public synchronized int getValue() {
        try {
            Thread.sleep(1000);
            return value;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized void setValue(int value) {
        try {
            Thread.sleep(1000);
            this.value = value;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
