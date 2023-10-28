package lection4.task1;

public class Main {
    public static void main(String[] args) {
        Object monitor = new Object();
        Thread num1 = new Thread(new Number(1, monitor));
        Thread num2 = new Thread(new Number(2, monitor));
        Thread num3 = new Thread(new Number(3, monitor));

        num1.start();
        num2.start();
        num3.start();
    }
}
