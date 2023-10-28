package lection4;

public class Task implements Runnable{
    private final int right, left;

    public Task(int right, int left) {
        this.right = right;
        this.left = left;
    }


    @Override
    public void run() {
        System.out.println(right + left);
    }

    @Override
    public String toString() {
        return String.format("%s + %s", right, left);
    }
}
