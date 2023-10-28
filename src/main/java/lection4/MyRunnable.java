package lection4;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("2. Hello fromThread: " + Thread.currentThread());
    }
}
