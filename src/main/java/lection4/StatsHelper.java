package lection4;

import java.util.Scanner;

public class StatsHelper {

    private static int cnt = 0;

    public static void main(String[] args) throws InterruptedException {

        Thread readThread = new Thread(() -> {
            Scanner in = new Scanner(System.in);
            while (in.hasNextLine()) {
                String line = in.nextLine();
                cnt++;
            }
        });
        readThread.setDaemon(true);
        readThread.start();
        readThread.interrupt(); // Отключает поток

        while (true) {
            System.out.println(cnt + " message input by user");
            Thread.sleep(1000);
        }
    }
}
