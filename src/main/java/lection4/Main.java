package lection4;

public class Main {
    public static void main(String[] args) throws InterruptedException {

//        System.out.println(123);
//        System.out.println(Thread.currentThread().getName());
//        for (int i = 0; i < 3; i++) {
//            MyThread thread = new MyThread();
//            thread.start();
//            thread.join(); // Убивается многопоточность, но сохраняется порядок вызовов
//        }
//        System.out.println();
//
//        for (int i = 0; i < 5; i++) {
//            Thread thread = new Thread(new MyRunnable());
//            thread.start();
//            thread.join();
//        }
//
//        for (int i = 0; i < 3; i++) {
//            new Thread(() -> {
//                System.out.println("3. Hello from: " + Thread.currentThread());
//            }).start();
//        }


        Thread tic = new Thread(new TicTac("["));
        Thread tac = new Thread(new TicTac("]"));
//        tic.setDaemon(true);
//        tac.setDaemon(true);
        tic.start();
        tac.start();
    }
}
